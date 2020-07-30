package kr.kieran.captcha.cmd;

import com.massivecraft.massivecore.command.editor.CommandEditSingleton;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import kr.kieran.captcha.Perm;
import kr.kieran.captcha.entity.MConf;

public class CmdCaptchaConfig extends CommandEditSingleton<MConf>
{
    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CmdCaptchaConfig()
    {
        super(MConf.get());

        // Requirements
        this.addRequirements(RequirementHasPerm.get(Perm.CONFIG));
    }

}
