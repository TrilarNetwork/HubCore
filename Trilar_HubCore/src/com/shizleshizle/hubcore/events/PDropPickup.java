package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;

public class PDropPickup  implements Listener {

	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		User p = new User(e.getPlayer());
		if (LH.isDisabled(p)) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPickup(PlayerPickupItemEvent e) {
		User p = new User(e.getPlayer());
		if (LH.isDisabled(p)) {
			e.setCancelled(true);
		}
	}
}