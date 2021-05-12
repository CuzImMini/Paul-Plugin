package de.paul.paulsplugin.warp;

import dev.minecode.core.api.CoreAPI;
import dev.minecode.core.api.object.Language;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreateWarps implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        String noRights = CoreAPI.getInstance().getFileManager().getFileObject(CoreAPI.getInstance().getPluginManager().getPlugin("Paul-Plugin"), "messages.yml").getConf().node("no-rights").getString();
        Language language = CoreAPI.getInstance().getPlayerManager().getPlayer(commandSender.getName()).getLanguage(CoreAPI.getInstance().getPluginManager().getPlugin("Paul-Plugin"));

        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(noRights);
        }


        return true;
    }
}
