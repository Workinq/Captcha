package kr.kieran.captcha.cmd;

import com.massivecraft.massivecore.command.MassiveCommand;
import kr.kieran.captcha.entity.MPlayer;

public class CaptchaCommand extends MassiveCommand
{
    // -------------------------------------------- //
    // FIELDS
    // -------------------------------------------- //

    public MPlayer msender;

    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CaptchaCommand()
    {
        this.setSetupEnabled(true);
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public void senderFields(boolean set)
    {
        this.msender = set ? MPlayer.get(sender) : null;
    }

}
