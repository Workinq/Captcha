package kr.kieran.captcha.cmd;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.requirement.RequirementIsPlayer;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import kr.kieran.captcha.cmd.req.ReqHasCaptcha;
import kr.kieran.captcha.engine.EngineCaptcha;
import kr.kieran.captcha.entity.MConf;
import kr.kieran.captcha.entity.object.Captcha;

public class CmdCaptchaComplete extends CaptchaCommand
{
    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CmdCaptchaComplete()
    {
        // Parameters
        this.addParameter(TypeString.get(), "code");

        // Requirements
        this.addRequirements(RequirementIsPlayer.get());
        this.addRequirements(ReqHasCaptcha.get());
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public void perform() throws MassiveException
    {
        // Args
        String code = this.readArg();
        Captcha captcha = msender.getCaptcha();

        // Verify
        if (!code.equals(captcha.getCaptcha()))
        {
            throw new MassiveException().setMsg(MConf.get().incorrectCaptchaMsg);
        }

        // Apply
        EngineCaptcha.get().clearCaptcha(me, msender);

        // Inform
        msender.msg(MConf.get().correctCaptchaMsg);
    }

}
