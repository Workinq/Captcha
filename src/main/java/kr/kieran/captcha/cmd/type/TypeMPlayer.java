package kr.kieran.captcha.cmd.type;

import com.massivecraft.massivecore.command.type.Type;
import kr.kieran.captcha.entity.MPlayer;
import kr.kieran.captcha.entity.MPlayerColl;

public class TypeMPlayer
{
    // -------------------------------------------- //
    // INSTANCE
    // -------------------------------------------- //

    public static Type<MPlayer> get()
    {
        return MPlayerColl.get().getTypeEntity();
    }

}
