package net.sharpydev.basic;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        //TODO: Messages
        this.saveDefaultConfig();
        registerListeners();
    }

    public void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
       // pm.registerEvents();
    }
}
