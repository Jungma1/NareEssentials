package com.jungma.nareessentials;

import org.bukkit.plugin.java.JavaPlugin;

public final class NareEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NareEssentials plugin start");
    }

    @Override
    public void onDisable() {
        getLogger().info("NareEssentials plugin stop");
    }
}
