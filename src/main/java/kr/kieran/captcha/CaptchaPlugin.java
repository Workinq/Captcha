package kr.kieran.captcha;

import com.massivecraft.massivecore.MassivePlugin;
import com.massivecraft.massivecore.collections.MassiveList;
import kr.kieran.captcha.entity.MPlayerColl;
import kr.kieran.captcha.entity.MConfColl;

import java.util.List;

public class CaptchaPlugin extends MassivePlugin
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static CaptchaPlugin i;
    public CaptchaPlugin() { CaptchaPlugin.i = this; }
    public static CaptchaPlugin get() { return i; }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public void onEnableInner()
    {
        this.activateAuto();
    }

    @Override
    public List<Class<?>> getClassesActiveColls()
    {
        return new MassiveList<>(
                MConfColl.class,
                MPlayerColl.class
        );
    }

}
