package me.an1lsalan.smplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SMPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
    }
}
