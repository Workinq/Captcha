package kr.kieran.captcha.entity.object;

import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.ps.PS;
import com.massivecraft.massivecore.store.EntityInternal;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.material.MaterialData;

public class Captcha extends EntityInternal<Captcha>
{
    // -------------------------------------------- //
    // FIELDS
    // -------------------------------------------- //

    // Stores the captcha the player needs to complete.
    // Null means there is no captcha
    private String captcha;

    // Stores all of the previous block materials.
    private MassiveMap<PS, MaterialData> oldBlocks;

    // -------------------------------------------- //
    // FIELD: captcha
    // -------------------------------------------- //

    public boolean hasCaptcha() { return this.captcha != null && !this.captcha.isEmpty(); }
    public String getCaptcha() { return this.captcha; }

    public void setCaptcha(String captcha)
    {
        // Clean input
        String target = clean(captcha);

        // Detect Nochange
        if (MUtil.equals(this.captcha, target)) return;

        // Apply
        this.captcha = target;

        // Mark as changed
        this.changed();
    }

    // -------------------------------------------- //
    // FIELD: oldBlocks
    // -------------------------------------------- //

    public MassiveMap<PS, MaterialData> getOldBlocks()
    {
        // Clean input
        MassiveMap<PS, MaterialData> ret = this.oldBlocks;
        if (ret == null || ret.isEmpty()) ret = new MassiveMap<>();

        // Return
        return ret;
    }

    public void setOldBlocks(MassiveMap<PS, MaterialData> oldBlocks)
    {
        // Apply
        this.oldBlocks = oldBlocks;

        // Mark as changed
        this.changed();
    }

    public boolean hasOldBlocks()
    {
        return !oldBlocks.isEmpty();
    }

    public void clearOldBlocks()
    {
        // Apply
        this.oldBlocks.clear();

        // Mark as changed
        this.changed();
    }

    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public Captcha() { this(null, new MassiveMap<>()); }
    public Captcha(String captcha) { this(captcha, new MassiveMap<>()); }

    public Captcha(String captcha, MassiveMap<PS, MaterialData> oldBlocks)
    {
        this.captcha = captcha;
        this.oldBlocks = oldBlocks;
    }

    // -------------------------------------------- //
    // UTIL
    // -------------------------------------------- //

    public static String clean(String message)
    {
        String target = message;
        if (target == null) return null;

        target = target.trim();
        if (target.isEmpty()) target = null;

        return target;
    }

}
