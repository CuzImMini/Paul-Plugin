package de.paul.paulsplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sander implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command ping, String label, String[] strings) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            String name = player.getName();

            if (player.getName().equals("_CuzImTooFame_")) {

                player.setHealth(0);

                Bukkit.broadcastMessage("§6Der Spieler " + name + " §6 ist geplatzt, weil er zu Fett war.");

            } else {

                sender.sendMessage("ist, wie der folgende Text, §lFETT");

            }

        } else {

            sender.sendMessage("§aDas kann nur ein Spieler.");

        }
        return true;
    }
}
