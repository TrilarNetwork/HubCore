package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class MSpawn  implements Listener {

	@EventHandler
	public void onSpawn(EntitySpawnEvent e) {
		e.setCancelled(true);
	}
}