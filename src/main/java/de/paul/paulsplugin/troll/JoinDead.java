package de.paul.paulsplugin.troll;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinDead implements Listener {


    @EventHandler
    public void killPlayerJoin(PlayerJoinEvent event) {

        Location spawntack = event.getPlayer().getLocation();
        Location spawn = new Location(spawntack.getWorld(), spawntack.getX(), spawntack.getY() + 1.5, spawntack.getZ());

        if (spawntack.getYaw() > -135 && spawntack.getYaw() < -45) {
            //Plus auf X-Achse
            Location attack = new Location(spawn.getWorld(), spawn.getX() + 6, spawn.getY() + 5, spawn.getZ());

            SpawnArrow.launchArrow(attack, spawn);

        } else if (spawntack.getYaw() > -45 && spawntack.getYaw() < 45) {
            //Plus auf Z-Achse
            Location attack = new Location(spawn.getWorld(), spawn.getX(), spawn.getY() + 5, spawn.getZ() + 6);

            SpawnArrow.launchArrow(attack, spawn);

        } else if (spawntack.getYaw() > 45 && spawntack.getYaw() < 135) {
            //Minus auf X-Achse
            Location attack = new Location(spawn.getWorld(), spawn.getX() - 6, spawn.getY() + 5, spawn.getZ());

            SpawnArrow.launchArrow(attack, spawn);

        } else if (spawntack.getYaw() > 135 && spawntack.getYaw() < -135) {
            //Minus auf Z-Achse
            Location attack = new Location(spawn.getWorld(), spawn.getX(), spawn.getY() + 5, spawn.getZ() - 6);

            SpawnArrow.launchArrow(attack, spawn);
        }


    }
}
