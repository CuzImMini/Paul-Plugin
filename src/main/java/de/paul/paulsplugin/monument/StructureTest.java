package de.paul.paulsplugin.monument;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class StructureTest implements Listener {

    @EventHandler
    public void handleBlockClick(PlayerInteractEvent event) {

        Block block = event.getClickedBlock();

        if (block != null) {


            if (block.getType() == Material.OAK_LOG) {

                Location furnace = block.getLocation();
                Location furnacedrueber = new Location(furnace.getWorld(), furnace.getX(), furnace.getY() + 1, furnace.getZ());
                Location unten1 = new Location(furnace.getWorld(), furnace.getX() - 1, furnace.getY(), furnace.getZ());
                Location unten2 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY(), furnace.getZ());
                Location oben1 = new Location(furnace.getWorld(), furnace.getX() + 1, furnace.getY(), furnace.getZ());
                Location oben2 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY(), furnace.getZ());
                Location rechts1 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY(), furnace.getZ() + 1);
                Location rechts2 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY(), furnace.getZ() + 2);
                Location links1 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY(), furnace.getZ() - 1);
                Location links2 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY(), furnace.getZ() - 2);
                Location orechts = new Location(furnace.getWorld(), furnace.getX() + 1, furnace.getY(), furnace.getZ() + 1);
                Location olinks = new Location(furnace.getWorld(), furnace.getX() - 1, furnace.getY(), furnace.getZ() + 1);
                Location urechts = new Location(furnace.getWorld(), furnace.getX() + 1, furnace.getY(), furnace.getZ() - 1);
                Location ulinks = new Location(furnace.getWorld(), furnace.getX() - 1, furnace.getY(), furnace.getZ() - 1);

                Location haken1 = new Location(furnace.getWorld(), furnace.getX() + 1, furnace.getY(), furnace.getZ() - 2);
                Location haken2 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY(), furnace.getZ() - 2);
                Location haken3 = new Location(furnace.getWorld(), furnace.getX() - 1, furnace.getY(), furnace.getZ() + 2);
                Location haken4 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY(), furnace.getZ() + 2);
                Location haken5 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY(), furnace.getZ() - 1);
                Location haken6 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY(), furnace.getZ() - 2);
                Location haken7 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY(), furnace.getZ() + 1);
                Location haken8 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY(), furnace.getZ() + 2);

                Location unten11 = new Location(furnace.getWorld(), furnace.getX() - 1, furnace.getY() + 20, furnace.getZ());
                Location unten22 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY() + 20, furnace.getZ());
                Location oben13 = new Location(furnace.getWorld(), furnace.getX() + 1, furnace.getY() + 20, furnace.getZ());
                Location oben24 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY() + 20, furnace.getZ());
                Location rechts5 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY() + 20, furnace.getZ() + 1);
                Location rechts6 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY() + 20, furnace.getZ() + 2);
                Location links17 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY() + 20, furnace.getZ() - 1);
                Location links28 = new Location(furnace.getWorld(), furnace.getX(), furnace.getY() + 20, furnace.getZ() - 2);

                Location haken11 = new Location(furnace.getWorld(), furnace.getX() + 1, furnace.getY() + 20, furnace.getZ() - 2);
                Location haken22 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY() + 20, furnace.getZ() - 2);
                Location haken33 = new Location(furnace.getWorld(), furnace.getX() - 1, furnace.getY() + 20, furnace.getZ() + 2);
                Location haken44 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY() + 20, furnace.getZ() + 2);
                Location haken55 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY() + 20, furnace.getZ() - 1);
                Location haken66 = new Location(furnace.getWorld(), furnace.getX() - 2, furnace.getY() + 20, furnace.getZ() - 2);
                Location haken77 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY() + 20, furnace.getZ() + 1);
                Location haken88 = new Location(furnace.getWorld(), furnace.getX() + 2, furnace.getY() + 20, furnace.getZ() + 2);

                if (oben1.getBlock().getType() == Material.GOLD_BLOCK &&
                        oben2.getBlock().getType() == Material.GOLD_BLOCK &&
                        unten1.getBlock().getType() == Material.GOLD_BLOCK &&
                        unten2.getBlock().getType() == Material.GOLD_BLOCK &&
                        rechts1.getBlock().getType() == Material.GOLD_BLOCK &&
                        rechts2.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken1.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken2.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken3.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken4.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken5.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken6.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken7.getBlock().getType() == Material.GOLD_BLOCK &&
                        haken8.getBlock().getType() == Material.GOLD_BLOCK &&
                        links1.getBlock().getType() == Material.GOLD_BLOCK &&
                        links2.getBlock().getType() == Material.GOLD_BLOCK) {


                    furnacedrueber.getBlock().setType(Material.BEACON);
                    furnace.getBlock().setType(Material.DIAMOND_BLOCK);
                    rechts1.getBlock().setType(Material.DIAMOND_BLOCK);
                    links1.getBlock().setType(Material.DIAMOND_BLOCK);
                    oben1.getBlock().setType(Material.DIAMOND_BLOCK);
                    unten1.getBlock().setType(Material.DIAMOND_BLOCK);
                    orechts.getBlock().setType(Material.DIAMOND_BLOCK);
                    olinks.getBlock().setType(Material.DIAMOND_BLOCK);
                    urechts.getBlock().setType(Material.DIAMOND_BLOCK);
                    ulinks.getBlock().setType(Material.DIAMOND_BLOCK);

                    haken11.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken22.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken33.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken44.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken55.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken66.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken77.getBlock().setType(Material.DIAMOND_BLOCK);
                    haken88.getBlock().setType(Material.DIAMOND_BLOCK);

                    oben13.getBlock().setType(Material.DIAMOND_BLOCK);
                    oben24.getBlock().setType(Material.DIAMOND_BLOCK);
                    unten11.getBlock().setType(Material.DIAMOND_BLOCK);
                    unten22.getBlock().setType(Material.DIAMOND_BLOCK);
                    rechts5.getBlock().setType(Material.DIAMOND_BLOCK);
                    rechts6.getBlock().setType(Material.DIAMOND_BLOCK);
                    links17.getBlock().setType(Material.DIAMOND_BLOCK);
                    links28.getBlock().setType(Material.DIAMOND_BLOCK);


                }


            }


        }


    }
}

