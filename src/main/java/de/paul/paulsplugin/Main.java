package de.paul.paulsplugin;

import de.paul.paulsplugin.commands.Heal;
import de.paul.paulsplugin.commands.Pingpong;
import de.paul.paulsplugin.commands.Sander;
import de.paul.paulsplugin.commands.Dice;
import de.paul.paulsplugin.troll.JoinDead;
import de.paul.paulsplugin.messages.MessageListener;
import de.paul.paulsplugin.monument.StructureTest;
import de.paul.paulsplugin.troll.TestArrow;
import de.paul.paulsplugin.warp.CreateWarps;
import dev.minecode.core.spigot.CoreSpigot;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        System.out.println("Messages wurde aktiviert");

        Bukkit.getPluginManager().registerEvents(new MessageListener(), this);
        Bukkit.getPluginManager().registerEvents(new StructureTest(), this);
        Bukkit.getPluginManager().registerEvents(new JoinDead(), this);

        getCommand("ping").setExecutor(new Pingpong());
        getCommand("sander").setExecutor(new Sander());
        getCommand("heal").setExecutor(new Heal());
        getCommand("rolldice").setExecutor(new Dice());
        getCommand("shootme").setExecutor(new TestArrow());

        getCommand("createwarp").setExecutor(new CreateWarps());

        CoreSpigot coreSpigot = CoreSpigot.getInstance();
        coreSpigot.registerPlugin("Paul-Plugin", getDescription().getVersion(), this);

    }

    public static Main getInstance() {
        return instance;
    }
}

