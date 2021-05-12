package de.paul.paulsplugin.troll;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestArrow implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender,Command command,String s,String[] strings) {

        if (commandSender instanceof Player) {

            Player player = (Player) commandSender;
            Location spawntack = player.getLocation();
            Location spawn = new Location(spawntack.getWorld(), spawntack.getX(), spawntack.getY() + 1.5, spawntack.getZ());

            if (spawntack.getYaw() > -135 && spawntack.getYaw() < -45) {
                //Plus auf X-Achse
                Location attack = new Location(spawn.getWorld(), spawn.getX() + 6, spawn.getY() + 5, spawn.getZ());

                SpawnArrow.launchArrow(attack, spawn);
                return true;

            }
            if (spawntack.getYaw() > -45 && spawntack.getYaw() < 45) {
                //Plus auf Z-Achse
                Location attack = new Location(spawn.getWorld(), spawn.getX(), spawn.getY() + 5, spawn.getZ() + 6);

                SpawnArrow.launchArrow(attack, spawn);
                return true;

            }
            if (spawntack.getYaw() > 45 && spawntack.getYaw() < 135) {
                //Minus auf X-Achse
                Location attack = new Location(spawn.getWorld(), spawn.getX() - 6, spawn.getY() + 5, spawn.getZ());

                SpawnArrow.launchArrow(attack, spawn);
                return true;

            }
            if (spawntack.getYaw() > 135 && spawntack.getYaw() < -135) {
                //Minus auf Z-Achse
                Location attack = new Location(spawn.getWorld(), spawn.getX(), spawn.getY() + 5, spawn.getZ() - 6);

                SpawnArrow.launchArrow(attack, spawn);
                return true;
            }
        } else {

            commandSender.sendMessage("§aDas kann nur ein Spieler!");
            return true;
        }

        return true;
    }
}
