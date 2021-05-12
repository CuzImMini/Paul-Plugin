package de.paul.paulsplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Pingpong implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player && sender.hasPermission("paulplugin.test.ping")) {

            Player player = (Player) sender;

            final int ping = (((CraftPlayer) player).getHandle().ping);
            sender.sendMessage("§cPong! Dein Ping beträgt §6" + ping + " MS. §cFast Glasfaser ;D");

            return true;

        }

        return true;
    }
}
