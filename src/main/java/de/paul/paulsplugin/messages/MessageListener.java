package de.paul.paulsplugin.messages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MessageListener implements Listener {

    @EventHandler
    public void handlePlayerJoin(PlayerJoinEvent event) {

        event.setJoinMessage("§6Der Spieler §b" + event.getPlayer().getName() + " §6ist auf den Server geslidet.");

    }

    @EventHandler
    public void handlePlayerDead(PlayerDeathEvent event) {

        event.setDeathMessage("§6Der Spieler §b" + event.getEntity().getName() + " §6war leider zu doof.");

    }

    @EventHandler
    public void handlePlayerQuit(PlayerQuitEvent event) {

        event.setQuitMessage("§6Der Spieler §b" + event.getPlayer().getName() + " §6ist weg vom Fenster.");

    }

}