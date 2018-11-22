package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.shizleshizle.core.objects.User;

public class PQuit  implements Listener {

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		User p = new User(e.getPlayer());
		p.clearInventory();
	}
}