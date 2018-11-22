package com.shizleshizle.hubcore.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.shizleshizle.hubcore.utils.LGUI;

import me.shizleshizle.core.objects.User;

public class PInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		User p = new User(e.getPlayer());
		ItemStack i = p.getItemInHand();
		if (i.getType() == Material.WATCH) {
			e.setCancelled(true);
			LGUI.openServer(p);
		} else if (i.getType() == Material.CHEST) {
			e.setCancelled(true);
			LGUI.openSettings(p);
		}
	}

}
