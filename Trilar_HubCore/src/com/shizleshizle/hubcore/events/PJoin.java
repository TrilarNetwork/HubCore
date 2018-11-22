package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.shizleshizle.hubcore.utils.LobbyHandler;

import me.shizleshizle.core.objects.User;

public class PJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		User p = new User(e.getPlayer());
		e.setJoinMessage(null);
		if (!LobbyHandler.isDisabled(p)) {
			LobbyHandler.disableInventory(p);
		}
		//give items
	}

}
