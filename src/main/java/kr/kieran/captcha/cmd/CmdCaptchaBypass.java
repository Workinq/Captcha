package kr.kieran.captcha.cmd;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.type.primitive.TypeBooleanYes;
import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivecore.util.Txt;
import kr.kieran.captcha.CaptchaPlugin;

public class CmdCaptchaBypass extends CaptchaCommand
{
    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CmdCaptchaBypass()
    {
        // Parameters
        this.addParameter(TypeBooleanYes.get(), "on/off", "flip");
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public void perform() throws MassiveException
    {
        // Args
        boolean target = this.readArg( ! msender.isBypassing());

        // Apply
        msender.setBypassing(target);

        // Inform
        String desc = Txt.parse(msender.isBypassing() ? "<g>ENABLED" : "<b>DISABLED");

        String messageYou = Txt.parse("<g>You <i>%s <i>captcha bypass mode.", desc);
        String messageLog = Txt.parse("<i>%s %s <i>captcha bypass mode.", msender.getDisplayName(IdUtil.getConsole()), desc);

        msender.message(messageYou);
        CaptchaPlugin.get().log(messageLog);
    }

}
