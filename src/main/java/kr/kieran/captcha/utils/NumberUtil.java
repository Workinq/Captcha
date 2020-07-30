package kr.kieran.captcha.utils;

import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.ps.PS;
import kr.kieran.captcha.entity.MConf;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

@SuppressWarnings({"deprecation", "DuplicatedCode", "PointlessArithmeticExpression"})
public class NumberUtil
{

    public static MassiveMap<PS, MaterialData> numberZero(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberOne(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 3, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 2, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberTwo(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 3, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberThree(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 3, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 2, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberFour(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract((inverted ? -1 : 1) * -1, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 2, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberFive(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 3, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberSix(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 2, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 4, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberSeven(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 2, 4, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberEight(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 2, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 4, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 4, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 4, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 4, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 4, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> numberNine(Location start, Player player, boolean inverted)
    {
        MassiveMap<PS, MaterialData> oldBlocks = new MassiveMap<>();

        start.subtract(0, 3, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 2, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract((inverted ? -1 : 1) * 1, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.subtract(0, 1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, -1, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);
        start.add((inverted ? -1 : 1) * 1, 0, 0);
        oldBlocks.put(PS.valueOf(start), new MaterialData(start.getBlock().getType(), start.getBlock().getData()));
        player.sendBlockChange(start, MConf.get().blockMaterial, MConf.get().blockData);

        return oldBlocks;
    }

    public static MassiveMap<PS, MaterialData> displayNumber(int number, Location location, Player player)
    {
        boolean inverted = MConf.get().invertedCaptcha;

        switch (number)
        {
            case 0:
                return numberZero(location, player, inverted);
            case 1:
                return numberOne(location, player, inverted);
            case 2:
                return numberTwo(location, player, inverted);
            case 3:
                return numberThree(location, player, inverted);
            case 4:
                return numberFour(location, player, inverted);
            case 5:
                return numberFive(location, player, inverted);
            case 6:
                return numberSix(location, player, inverted);
            case 7:
                return numberSeven(location, player, inverted);
            case 8:
                return numberEight(location, player, inverted);
            case 9:
                return numberNine(location, player, inverted);
            default:
                throw new IllegalArgumentException("No method to display the number " + number);
        }
    }

}
