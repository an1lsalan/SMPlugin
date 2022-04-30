package me.an1lsalan.smplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SMPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin enabled");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(event.getPlayer().getDisplayName() + " ist dem verdammten Server beigetreten!");
    }

    @EventHandler
    public void onLeaveBed(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(event.getPlayer().getDisplayName() +",warum verlässt du dein Bett?");
    }
}
