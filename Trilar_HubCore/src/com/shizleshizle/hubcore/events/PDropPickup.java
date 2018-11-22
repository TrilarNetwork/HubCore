package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.shizleshizle.hubcore.utils.LobbyHandler;

import me.shizleshizle.core.objects.User;

public class PDropPickup  implements Listener {

	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		User p = new User(e.getPlayer());
		if (LobbyHandler.isDisabled(p)) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPickup(PlayerPickupItemEvent e) {
		User p = new User(e.getPlayer());
		if (LobbyHandler.isDisabled(p)) {
			e.setCancelled(true);
		}
	}
}