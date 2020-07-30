package kr.kieran.captcha.cmd.req;

import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementAbstract;
import com.massivecraft.massivecore.util.MUtil;
import com.massivecraft.massivecore.util.Txt;
import kr.kieran.captcha.entity.MPlayer;
import org.bukkit.command.CommandSender;

public class ReqHasCaptcha extends RequirementAbstract
{
    // -------------------------------------------- //
    // SERIALIZABLE
    // -------------------------------------------- //

    private static final long serialVersionUID = 1L;

    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static ReqHasCaptcha i = new ReqHasCaptcha();
    public static ReqHasCaptcha get() { return i; }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public boolean apply(CommandSender sender, MassiveCommand command)
    {
        if (MUtil.isntSender(sender)) return false;

        MPlayer mplayer = MPlayer.get(sender);
        return mplayer.hasCaptcha() && mplayer.getCaptcha().hasCaptcha();
    }

    @Override
    public String createErrorMessage(CommandSender sender, MassiveCommand command)
    {
        return Txt.parse("<b>You must have a captcha to %s.", getDesc(command));
    }

}
