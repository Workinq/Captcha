package kr.kieran.captcha.entity;

import com.massivecraft.massivecore.store.SenderEntity;
import com.massivecraft.massivecore.util.MUtil;
import kr.kieran.captcha.CaptchaParticipator;
import kr.kieran.captcha.Perm;
import kr.kieran.captcha.entity.object.Captcha;

public class MPlayer extends SenderEntity<MPlayer> implements CaptchaParticipator
{

    // -------------------------------------------- //
    // META
    // -------------------------------------------- //

    public static MPlayer get(Object oid)
    {
        return MPlayerColl.get().get(oid);
    }

    // -------------------------------------------- //
    // LOAD
    // -------------------------------------------- //

    @Override
    public MPlayer load(MPlayer that)
    {
        this.setBypassing(that.bypassing);
        this.setCaptcha(that.captcha);
        return this;
    }

    // -------------------------------------------- //
    // FIELDS
    // -------------------------------------------- //

    // Is this player bypassing the captcha?
    // Null means false
    private Boolean bypassing = null;

    // The captcha the player needs to enter.
    // Null means there is no captcha
    private Captcha captcha = null;

    // -------------------------------------------- //
    // IS DEFAULT
    // -------------------------------------------- //

    @Override
    public boolean isDefault()
    {
        if (this.isBypassing()) return false;
        return true;
    }

    // -------------------------------------------- //
    // FIELD: bypassing
    // -------------------------------------------- //

    public boolean isBypassing()
    {
        // Verify
        if (this.bypassing == null) return false;
        if (!this.bypassing) return false;

        if (!this.hasPermission(Perm.BYPASS, true))
        {
            this.setBypassing(false);
            return false;
        }

        // Return
        return true;
    }

    public void setBypassing(Boolean overriding)
    {
        // Clean input
        Boolean target = overriding;
        if (MUtil.equals(target, false)) target = null;

        // Detect Nochange
        if (MUtil.equals(this.bypassing, target)) return;

        // Apply
        this.bypassing = target;

        // Mark as changed
        this.changed();
    }

    // -------------------------------------------- //
    // FIELD: captcha
    // -------------------------------------------- //

    public boolean hasCaptcha() { return this.captcha != null; }
    public Captcha getCaptcha() { return captcha; }

    public void setCaptcha(Captcha captcha)
    {
        // Apply
        this.captcha = captcha;

        // Mark as changed
        this.changed();
    }

}
