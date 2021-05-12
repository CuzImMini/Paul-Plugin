package de.paul.paulsplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
        if (!commandSender.hasPermission("paulplugin.heal.self")) {
            commandSender.sendMessage("§4Dazu hast du keine Rechte!");
            return true;
        }

        if (args.length == 0) {
            if (!(commandSender instanceof Player)) {
                commandSender.sendMessage("§aDas kann nur ein Spieler!");
                return true;
            }

            Player player = (Player) commandSender;

            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage("§aDu hast §cdich §ageheilt und gesättigt!");
            return true;

        }

        if (args.length == 1) {
            if (!commandSender.hasPermission("paulplugin.heal.others")) {

                commandSender.sendMessage("§4Dazu hast du keine Rechte!");
                return true;
            }

            Player target = Bukkit.getPlayer(args[0]);

            if (target == null) {
                commandSender.sendMessage("§aDer Spieler §4" + args[0] + " §aist nicht online!");
                return true;
            }
            if (!(target == commandSender)) {

                target.setHealth(20);
                target.setFoodLevel(20);
                target.sendMessage("§aDu wurdest von §c" + commandSender.getName() + " §ageheilt und gesättigt!");
                commandSender.sendMessage("§aDu hast §c" + target.getName() + " §ageheilt und gesättigt!");
                return true;

            }

            target.setHealth(20);
            target.setFoodLevel(20);
            commandSender.sendMessage("§aDu hast §cdich §ageheilt und gesättigt!");
            return true;

        }

        commandSender.sendMessage("§7Bitte verwende:§a /heal §d[Spielername]");
        return true;


    }

}

