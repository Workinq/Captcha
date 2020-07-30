package kr.kieran.captcha.engine;

import com.massivecraft.massivecore.Engine;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngineCommand extends Engine
{
    // -------------------------------------------- //
    // INSTANCE
    // -------------------------------------------- //

    private static EngineCommand i = new EngineCommand();
    public static EngineCommand get() { return i; }

    // -------------------------------------------- //
    // COMMAND LISTENERS
    // -------------------------------------------- //

    @EventHandler
    public void command(PlayerCommandPreprocessEvent event)
    {
        String message = event.getMessage().toLowerCase();
        if (!message.startsWith("/captcha")) return;

        String[] args = message.split(" ");
        if (args.length < 2) return;
        if (!this.isInt(args[1])) return;

        List<String> command = new ArrayList<>(Arrays.asList(args));
        command.add(1, "complete");
        event.setMessage(String.join(" ", command).trim());
    }

    private boolean isInt(String text)
    {
        try
        {
            Integer.parseInt(text);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

}
