package kr.kieran.captcha;

import com.massivecraft.massivecore.Identified;
import com.massivecraft.massivecore.util.PermissionUtil;
import org.bukkit.permissions.Permissible;

public enum Perm implements Identified
{

    BASECOMMAND,
    BYPASS,
    COMPLETE,
    CONFIG,
    VERSION,

    // END OF LIST
    ;

    // -------------------------------------------- //
    // FIELDS
    // -------------------------------------------- //

    private final String id;
    @Override public String getId() { return this.id; }

    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    Perm()
    {
        this.id = PermissionUtil.createPermissionId(CaptchaPlugin.get(), this);
    }

    // -------------------------------------------- //
    // HAS
    // -------------------------------------------- //

    public boolean has(Permissible permissible, boolean verboose)
    {
        return PermissionUtil.hasPermission(permissible, this, verboose);
    }

    public boolean has(Permissible permissible)
    {
        return PermissionUtil.hasPermission(permissible, this);
    }

}
