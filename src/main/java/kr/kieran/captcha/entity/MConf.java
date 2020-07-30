package kr.kieran.captcha.entity;

import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.Material;

import java.util.List;

@EditorName("config")
public class MConf extends Entity<MConf>
{
    // -------------------------------------------- //
    // META
    // -------------------------------------------- //

    protected static transient MConf i;
    public static MConf get() { return i; }

    // -------------------------------------------- //
    // OVERRIDE: ENTITY
    // -------------------------------------------- //

    @Override
    public MConf load(MConf that)
    {
        super.load(that);
        return this;
    }

    // -------------------------------------------- //
    // COMMAND ALIASES
    // -------------------------------------------- //

    public List<String> cmdAliases = MUtil.list("captcha");

    // -------------------------------------------- //
    // CAPTCHA DISPLAY
    // -------------------------------------------- //

    public long displayDelay = 10L;
    public boolean invertedCaptcha = false;

    // -------------------------------------------- //
    // SPAWN LOCATION
    // -------------------------------------------- //

    public String spawnWorld = "cannon";
    public int spawnX = 0;
    public int spawnY = 70;
    public int spawnZ = 0;

    // -------------------------------------------- //
    // CAPTCHA OFFSET
    // -------------------------------------------- //

    public int offsetX = 10;
    public int offsetY = 10;
    public int offsetZ = 0;

    // -------------------------------------------- //
    // CAPTCHA TASK
    // -------------------------------------------- //

    public long captchaDisplayDelay = 2500L;

    // -------------------------------------------- //
    // CAPTCHA BLOCK
    // -------------------------------------------- //

    public Material blockMaterial = Material.WOOL;
    public byte blockData = (byte) 14;

    // -------------------------------------------- //
    // MESSAGES
    // -------------------------------------------- //

    public String incorrectCaptchaMsg = "<b>The captcha code you entered wasn't correct, please try again.";
    public String correctCaptchaMsg = "<g>You <i>have successfully completed the captcha.";
    public String enterCaptchaMsg = "<b><bold>ERROR >> <white>You must complete the captcha before using the server selector! The captcha is the 3 <red>red numbers <white>floating in the <white>air <n>(/captcha <captcha>)";

    // -------------------------------------------- //
    // TITLE
    // -------------------------------------------- //

    public int ticksIn = 10;
    public int ticksStay = 100;
    public int ticksOut = 10;
    public String titleHeader = "<red><bold>CAPTCHA";
    public String titleSubHeader = "<gray>Type the 3 numbers you see near you";

    // -------------------------------------------- //
    // MISCELLANEOUS
    // -------------------------------------------- //

    public Material serverSelectorMaterial = Material.COMPASS;

}
