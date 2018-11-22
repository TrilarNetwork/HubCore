package com.shizleshizle.hubcore.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;

public class InvMove implements Listener {

	@EventHandler
	public void onInvMove(InventoryMoveItemEvent e) {
		if (e.getInitiator() instanceof Player) {
			User p = new User((Player) e.getInitiator());	
			if (LH.isDisabled(p)) {
				e.setCancelled(true);
			}
		}
	}
}