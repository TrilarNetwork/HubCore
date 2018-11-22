package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PDeath implements Listener {

	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		e.getDrops().clear();
		e.setDroppedExp(0);
		e.setKeepInventory(true);
		e.setNewTotalExp(0);
		e.setNewLevel(0);
		e.setDeathMessage(null);
	}
}