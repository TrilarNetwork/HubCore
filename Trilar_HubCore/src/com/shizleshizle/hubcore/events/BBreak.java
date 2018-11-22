package com.shizleshizle.hubcore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;

public class BBreak implements Listener {

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		User p = new User(e.getPlayer());
		if (LH.isDisabled(p)) {
			e.setCancelled(true);
		}
	}
}
