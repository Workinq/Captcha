package kr.kieran.captcha.cmd;

import com.massivecraft.massivecore.command.MassiveCommandVersion;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import kr.kieran.captcha.CaptchaPlugin;
import kr.kieran.captcha.Perm;
import kr.kieran.captcha.entity.MConf;

import java.util.List;

public class CmdCaptcha extends CaptchaCommand
{
    // -------------------------------------------- //
    // INSTANCE
    // -------------------------------------------- //

    private static CmdCaptcha i = new CmdCaptcha();
    public static CmdCaptcha get() { return i; }

    // -------------------------------------------- //
    // FIELDS
    // -------------------------------------------- //

    public CmdCaptchaBypass cmdCaptchaBypass = new CmdCaptchaBypass();
    public CmdCaptchaComplete cmdCaptchaComplete = new CmdCaptchaComplete();
    public CmdCaptchaConfig cmdCaptchaConfig = new CmdCaptchaConfig();
    public MassiveCommandVersion cmdFactionsVersion = new MassiveCommandVersion(CaptchaPlugin.get()).setAliases("v", "version").addRequirements(RequirementHasPerm.get(Perm.VERSION));

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public List<String> getAliases()
    {
        return MConf.get().cmdAliases;
    }

}
