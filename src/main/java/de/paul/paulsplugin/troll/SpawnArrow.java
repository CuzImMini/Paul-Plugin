package de.paul.paulsplugin.troll;

import de.paul.paulsplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.AbstractArrow;
import org.bukkit.entity.Arrow;
import org.bukkit.util.Vector;

import java.util.Objects;


public class SpawnArrow {

    public static void launchArrow(Location attack, Location spawn) {

        if (!(attack == null || spawn == null)) {


            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                Vector vector = spawn.toVector().subtract(attack.toVector());
                vector.normalize();
                for (int i = 10; i > 1; i--) {
                    Arrow pfeil = Objects.requireNonNull(spawn.getWorld()).spawnArrow(attack, vector, 1, 3);
                    pfeil.setPickupStatus(AbstractArrow.PickupStatus.DISALLOWED);

                }


            }, 20);

        }


    }

}
