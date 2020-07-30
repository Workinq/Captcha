package kr.kieran.captcha.engine;

import com.massivecraft.massivecore.Engine;
import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.mixin.MixinTitle;
import com.massivecraft.massivecore.ps.PS;
import kr.kieran.captcha.CaptchaPlugin;
import kr.kieran.captcha.entity.MConf;
import kr.kieran.captcha.entity.MPlayer;
import kr.kieran.captcha.entity.object.Captcha;
import kr.kieran.captcha.mixin.MixinVanish;
import kr.kieran.captcha.utils.NumberUtil;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.material.MaterialData;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("deprecation")
public class EngineCaptcha extends Engine
{
    // -------------------------------------------- //
    // INSTANCE
    // -------------------------------------------- //

    private static EngineCaptcha i = new EngineCaptcha();
    public static EngineCaptcha get() { return i; }

    // -------------------------------------------- //
    // FIELDS
    // -------------------------------------------- //

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    // -------------------------------------------- //
    // PLAYER JOIN
    // -------------------------------------------- //

    @EventHandler
    public void join(PlayerJoinEvent event)
    {
        // Args
        final Player player = event.getPlayer();
        final MPlayer mplayer = MPlayer.get(player);

        // Verify
        if (mplayer.isBypassing()) return;

        // Captcha
        this.generateCaptcha(player, mplayer);
    }

    private void generateCaptcha(final Player player, final MPlayer mplayer)
    {
        // Args
        final int firstNumber = this.getRandomNumber(), secondNumber = this.getRandomNumber(), thirdNumber = this.getRandomNumber();
        String captchaCode;
        if (MConf.get().invertedCaptcha)
        {
            captchaCode = thirdNumber + "" + secondNumber + "" + firstNumber;
        }
        else
        {
            captchaCode = firstNumber + "" + secondNumber + "" + thirdNumber;
        }
        Captcha captcha = new Captcha(captchaCode);

        // Apply
        mplayer.setCaptcha(captcha);

        // Hide
        MixinVanish.get().hideEveryoneFrom(player);

        // Inform
        MixinTitle.get().sendTitleMsg(player, MConf.get().ticksIn, MConf.get().ticksStay, MConf.get().ticksOut, MConf.get().titleHeader, MConf.get().titleSubHeader);

        // Wait X ticks so blocks don't update randomly
        Bukkit.getScheduler().runTaskLater(CaptchaPlugin.get(), () -> this.showCaptcha(player, mplayer, firstNumber, secondNumber, thirdNumber), MConf.get().displayDelay);
    }

    private void showCaptcha(final Player player, final MPlayer mplayer, final int... numbers) // Use int... BECAUSE I'M LAZY
    {
        // Verify
        if (player == null || mplayer == null) return;
        if (!mplayer.hasCaptcha() || !mplayer.getCaptcha().hasCaptcha()) return;

        // Args
        Location spawnLocation = new Location(Bukkit.getWorld(MConf.get().spawnWorld), MConf.get().spawnX, MConf.get().spawnY, MConf.get().spawnZ);
        Location startLocation = spawnLocation.clone().add(MConf.get().offsetX, MConf.get().offsetY, MConf.get().offsetZ);
        MassiveMap<PS, MaterialData> allBlocks = new MassiveMap<>();

        // Display
        allBlocks.putAll(NumberUtil.displayNumber(numbers[0], startLocation.clone(), player));
        allBlocks.putAll(NumberUtil.displayNumber(numbers[1], startLocation.clone().add(6, 0, 0), player));
        allBlocks.putAll(NumberUtil.displayNumber(numbers[2], startLocation.clone().add(12, 0, 0), player));

        // Apply
        mplayer.getCaptcha().setOldBlocks(allBlocks);
    }

    private int getRandomNumber() { return RANDOM.nextInt(0, 9); }

    // -------------------------------------------- //
    // PLAYER CHAT
    // -------------------------------------------- //

    @EventHandler
    public void chat(AsyncPlayerChatEvent event) throws ExecutionException, InterruptedException
    {
        final Player player = event.getPlayer();
        final String message = event.getMessage();

        // Fuuuuuuuuuutureeeeeeeeee
        Future<Boolean> future = Bukkit.getScheduler().callSyncMethod(CaptchaPlugin.get(), () ->
        {
            // Args
            MPlayer mplayer = MPlayer.get(player);

            // Verify
            if (!mplayer.hasCaptcha() || !mplayer.getCaptcha().hasCaptcha()) return false;

            // Correct
            if (message.equals(mplayer.getCaptcha().getCaptcha()))
            {
                // Inform
                mplayer.msg(MConf.get().correctCaptchaMsg);

                // Clear
                this.clearCaptcha(player, mplayer);
            }
            else
            {
                // Inform
                mplayer.msg(MConf.get().incorrectCaptchaMsg);
            }
            return true;
        });

        // Cancel
        if (future.get()) event.setCancelled(true);
    }

    public void clearCaptcha(Player player, MPlayer mplayer)
    {
        // Verify
        if (!mplayer.hasCaptcha() || !mplayer.getCaptcha().hasCaptcha()) return;

        // Loop
        if (mplayer.getCaptcha().hasOldBlocks())
        {
            for (Map.Entry<PS, MaterialData> entry : mplayer.getCaptcha().getOldBlocks().entrySet())
            {
                // Args
                PS location = entry.getKey();
                MaterialData mdata = entry.getValue();

                // Send
                player.sendBlockChange(location.asBukkitLocation(true), mdata.getItemType(), mdata.getData());
            }
        }

        // Show
        MixinVanish.get().showEveryoneTo(player);

        // Apply
        mplayer.getCaptcha().clearOldBlocks();
        mplayer.getCaptcha().setCaptcha(null);
        mplayer.setCaptcha(null);
    }

    // -------------------------------------------- //
    // PLAYER LOG IN/OUT
    // -------------------------------------------- //

    @EventHandler public void login(PlayerJoinEvent event) { MixinVanish.get().hideFromCaptchad(event.getPlayer()); }
    @EventHandler public void logout(PlayerQuitEvent event) { this.logout(event.getPlayer()); }
    @EventHandler public void logout(PlayerKickEvent event) { this.logout(event.getPlayer()); }

    private void logout(Player player)
    {
        // Args
        MPlayer mplayer = MPlayer.get(player);

        // Verify
        if (!mplayer.hasCaptcha() || !mplayer.getCaptcha().hasCaptcha()) return;

        // Apply
        mplayer.getCaptcha().clearOldBlocks();
        mplayer.getCaptcha().setCaptcha(null);
        mplayer.setCaptcha(null);
    }

}
