package net.sharpydev.reward;

import net.sharpydev.reward.command.RewardCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        //TODO: Messages
        this.saveDefaultConfig();
        registerListeners();

        PluginCommand pluginCommand = this.getCommand("reward");
        if (pluginCommand != null) {
            pluginCommand.setExecutor(new RewardCommand());
        } else {
            this.getLogger().severe("There was an error loading the plugin, please re-download the plugin or report this error to creators!");
        }
    }
    public void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
       // pm.registerEvents(new );
    }

    public void log(String string) {
        Bukkit.getLogger().info(string);
    }
}
