package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.shizleshizle.hubcore.utils.LobbyHandler;

import me.shizleshizle.core.objects.User;

public class PQuit  implements Listener {

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		User p = new User(e.getPlayer());
		if (LobbyHandler.isDisabled(p)) {
			e.setCancelled(true);
		}
		p.clearInventory();
	}
}