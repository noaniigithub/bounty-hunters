package net.Indyuce.bountyhunters.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.Indyuce.bountyhunters.api.PlayerData;

public class PlayerListener implements Listener {
	@EventHandler(priority = EventPriority.HIGHEST)
	public void a(PlayerJoinEvent event) {
		PlayerData.load(event.getPlayer());
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void b(PlayerQuitEvent event) {
		PlayerData playerData = PlayerData.get(event.getPlayer());
		playerData.saveFile();
		playerData.unload();
	}
}
