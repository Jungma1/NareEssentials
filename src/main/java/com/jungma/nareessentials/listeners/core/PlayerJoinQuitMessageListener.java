package com.jungma.nareessentials.listeners.core;

import static net.kyori.adventure.text.Component.text;

import com.jungma.nareessentials.NareEssentials;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

@RequiredArgsConstructor
public class PlayerJoinQuitMessageListener implements Listener {

    private final NareEssentials plugin;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        TextComponent joinTextComponent = text()
                .color(NamedTextColor.DARK_GRAY)
                .append(text("● ", NamedTextColor.DARK_GREEN))
                .append(text("Player '" + player.getName() + "' online"))
                .build();

        event.joinMessage(joinTextComponent);
        recordBukkitMessage(player);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        TextComponent quitTextComponent = text()
                .color(NamedTextColor.DARK_GRAY)
                .append(text("● ", NamedTextColor.DARK_RED))
                .append(text("Player '" + player.getName() + "' offline"))
                .build();

        event.quitMessage(quitTextComponent);
        recordBukkitMessage(player);
    }

    private void recordBukkitMessage(Player player) {
        plugin.getServer().getConsoleSender().sendMessage(
                ChatColor.DARK_AQUA + LocalDateTime.now().toString() + " / " + player.getUniqueId() + " / "
                        + player.getName());
    }
}
