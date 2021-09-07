package dev.plugins.essential.commands;

import dev.plugins.essential.App;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor{

    private App plugin;

    public HelloCommand(App plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players may execute this command!");
            return true;
        }

        Player p = (Player) sender;

        if (p.hasPermission("hello.use")) {
            p.sendMessage("hi!");
            return true;
        } else {
            p.sendMessage("You do not have permission to execute this command!");
        }
        return false;
    }
}
