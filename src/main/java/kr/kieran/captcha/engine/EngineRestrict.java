package kr.kieran.captcha.engine;

import com.massivecraft.massivecore.Engine;
import kr.kieran.captcha.CaptchaPlugin;
import kr.kieran.captcha.entity.MConf;
import kr.kieran.captcha.entity.MPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class EngineRestrict extends Engine
{
    // -------------------------------------------- //
    // INSTANCE
    // -------------------------------------------- //

    private static EngineRestrict i = new EngineRestrict();
    public static EngineRestrict get() { return i; }

    // -------------------------------------------- //
    // ITEM LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void drop(PlayerDropItemEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getPlayer());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    @EventHandler
    public void pickup(PlayerPickupItemEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getPlayer());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    // -------------------------------------------- //
    // BLOCK LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void breakBlock(BlockBreakEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getPlayer());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    @EventHandler
    public void placeBlock(BlockPlaceEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getPlayer());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    // -------------------------------------------- //
    // BLOCK LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void damaging(EntityDamageByEntityEvent event)
    {
        // Verify
        if ( ! (event.getDamager() instanceof Player)) return;
        if ( ! (event.getEntity() instanceof Player)) return;

        // Args
        MPlayer mdamaged = MPlayer.get(event.getEntity());

        // Verify
        if (this.isntRestricted(mdamaged)) return;

        // Cancel
        event.setCancelled(true);
    }

    @EventHandler
    public void damaged(EntityDamageByEntityEvent event)
    {
        // Verify
        if ( ! (event.getDamager() instanceof Player)) return;
        if ( ! (event.getEntity() instanceof Player)) return;

        // Args
        MPlayer mdamager = MPlayer.get(event.getDamager());

        // Verify
        if (this.isntRestricted(mdamager)) return;

        // Cancel
        event.setCancelled(true);
    }

    @EventHandler
    public void damage(EntityDamageEvent event)
    {
        // Verify
        if ( ! (event.getEntity() instanceof Player)) return;

        // Args
        MPlayer mplayer = MPlayer.get(event.getEntity());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    // -------------------------------------------- //
    // INVENTORY LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void click(InventoryClickEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getWhoClicked());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    @EventHandler
    public void interact(InventoryInteractEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getWhoClicked());

        // Verify
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    // -------------------------------------------- //
    // INTERACT LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void interact(PlayerInteractEvent event)
    {
        // Args
        Action action = event.getAction();
        Player player = event.getPlayer();
        MPlayer mplayer = MPlayer.get(player);

        // Verify
        if (action != Action.RIGHT_CLICK_AIR && action != Action.RIGHT_CLICK_BLOCK) return;
        if (event.getItem() == null || event.getItem().getType() != MConf.get().serverSelectorMaterial) return;
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);

        // Inform
        mplayer.msg(MConf.get().enterCaptchaMsg);

        // Close
        Bukkit.getScheduler().runTaskLater(CaptchaPlugin.get(), new Runnable()
        {
            @Override
            public void run()
            {
                if (player == null || !player.isOnline()) return;
                player.closeInventory();
            }
        }, 1L);
    }

    // -------------------------------------------- //
    // MISCELLANEOUS LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void command(PlayerCommandPreprocessEvent event)
    {
        // Args
        MPlayer mplayer = MPlayer.get(event.getPlayer());

        // Verify
        if (event.getMessage().toLowerCase().startsWith("/captcha")) return;
        if (this.isntRestricted(mplayer)) return;

        // Cancel
        event.setCancelled(true);
    }

    private boolean isntRestricted(MPlayer mplayer)
    {
        return mplayer == null || !mplayer.hasCaptcha() || !mplayer.getCaptcha().hasCaptcha();
    }

}
