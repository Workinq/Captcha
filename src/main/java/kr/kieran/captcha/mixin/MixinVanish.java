package kr.kieran.captcha.mixin;

import com.massivecraft.massivecore.mixin.Mixin;
import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivecore.util.MUtil;
import kr.kieran.captcha.entity.MPlayer;
import org.bukkit.entity.Player;

public class MixinVanish extends Mixin
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static MixinVanish d = new MixinVanish();
    private static MixinVanish i = d;
    public static MixinVanish get() { return i; }

    // -------------------------------------------- //
    // METHODS
    // -------------------------------------------- //

    public void showEveryoneTo(Object watcheeObject)
    {
        Player pwatchee = IdUtil.getPlayer(watcheeObject);
        if (pwatchee == null) return;

        for (Player pwatcher : MUtil.getOnlinePlayers())
        {
            if (pwatchee.equals(pwatcher)) continue;
            if (pwatchee.canSee(pwatcher)) continue;

            pwatchee.showPlayer(pwatcher);
        }
    }

    public void hideEveryoneFrom(Object watcheeObject)
    {
        Player pwatchee = IdUtil.getPlayer(watcheeObject);
        if (pwatchee == null) return;

        for (Player pwatcher : MUtil.getOnlinePlayers())
        {
            if (pwatchee.equals(pwatcher)) continue;
            if (!pwatchee.canSee(pwatcher)) continue;

            pwatchee.hidePlayer(pwatcher);
        }
    }

    public void hideFromCaptchad(Object watcheeObject)
    {
        Player pwatchee = IdUtil.getPlayer(watcheeObject);
        if (pwatchee == null) return;

        for (Player pwatcher : MUtil.getOnlinePlayers())
        {
            if (pwatchee.equals(pwatcher)) continue;
            if (!pwatcher.canSee(pwatchee)) continue;

            MPlayer mwatcher = MPlayer.get(pwatcher);
            if (!mwatcher.hasCaptcha() || !mwatcher.getCaptcha().hasCaptcha()) continue;

            pwatcher.hidePlayer(pwatchee);
        }
    }

}
