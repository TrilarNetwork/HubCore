package com.shizleshizle.hubcore.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.shizleshizle.hubcore.utils.LobbyHandler;

import me.shizleshizle.core.objects.User;

public class InvClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getWhoClicked() instanceof Player) {
			User p = new User((Player) e.getWhoClicked());
			if (LobbyHandler.isDisabled(p)) {
				e.setCancelled(true);
			}
		}
	}
}