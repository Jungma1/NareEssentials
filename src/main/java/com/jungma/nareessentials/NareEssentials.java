package com.jungma.nareessentials;

import com.jungma.nareessentials.listeners.core.PlayerJoinQuitMessageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NareEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NareEssentials plugin start");

        getServer().getPluginManager().registerEvents(new PlayerJoinQuitMessageListener(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("NareEssentials plugin stop");
    }
}
