package com.jungma.nareessentials;

import com.jungma.nareessentials.listeners.core.PlayerJoinQuitMessageListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NareEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NareEssentials plugin start");

        registerEvents();
    }

    @Override
    public void onDisable() {
        getLogger().info("NareEssentials plugin stop");
    }

    private void registerEvents() {
        Listener[] listeners = {
                new PlayerJoinQuitMessageListener(this)
        };

        for (Listener listener : listeners) {
            getServer().getPluginManager().registerEvents(listener, this);
        }
    }
}
