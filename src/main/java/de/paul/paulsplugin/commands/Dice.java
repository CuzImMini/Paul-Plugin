package de.paul.paulsplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

@SuppressWarnings("ALL")
public class Dice implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {

        Random random = new Random();
        Player player = (Player) commandSender;
        int zahl = (random.nextInt(6) + 1);
        player.sendMessage("§aDu hast eine §7" + zahl + " §agewürfelt!");
        return true;
    }
}
