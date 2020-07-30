package kr.kieran.captcha.task;

import com.massivecraft.massivecore.ModuloRepeatTask;
import com.massivecraft.massivecore.ps.PS;
import kr.kieran.captcha.entity.MConf;
import kr.kieran.captcha.entity.MPlayer;
import kr.kieran.captcha.entity.MPlayerColl;
import org.bukkit.entity.Player;

public class TaskDisplayCaptcha extends ModuloRepeatTask
{
    // -------------------------------------------- //
    // INSTANCE
    // -------------------------------------------- //

    public static TaskDisplayCaptcha i = new TaskDisplayCaptcha();
    public static TaskDisplayCaptcha get() { return i; }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public long getDelayMillis()
    {
        return MConf.get().captchaDisplayDelay;
    }

    @Override @SuppressWarnings("deprecation")
    public void invoke(long now)
    {
        // Loop
        for (MPlayer mplayer : MPlayerColl.get().getAll())
        {
            // Verify
            if (mplayer.isBypassing()) continue;
            if (!mplayer.hasCaptcha() || !mplayer.getCaptcha().hasCaptcha()) continue;
            if (!mplayer.getCaptcha().hasOldBlocks()) continue;

            // Args
            Player player = mplayer.getPlayer();

            // Show
            for (PS ps : mplayer.getCaptcha().getOldBlocks().keySet())
            {
                player.sendBlockChange(ps.asBukkitLocation(true), MConf.get().blockMaterial, MConf.get().blockData);
            }
        }
    }

}
