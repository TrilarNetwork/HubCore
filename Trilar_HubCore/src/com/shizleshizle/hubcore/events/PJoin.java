package com.shizleshizle.hubcore.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;
import me.shizleshizle.core.utils.CI;
import net.md_5.bungee.api.ChatColor;

public class PJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		User p = new User(e.getPlayer());
		e.setJoinMessage(null);
		if (!LH.isDisabled(p)) {
			LH.disableInventory(p);
		}
		setup(p);
		for (String l : LH.getPlayers()) {
			User x = new User(Bukkit.getPlayer(l));
			x.hideUser(p);
		}
	}

	
	private void setup(User p) {
		p.clearInventory();
		
		ItemStack i = CI.createItem(Material.WATCH, 1, -1, ChatColor.GOLD + "Server Selector", "", ChatColor.YELLOW.toString() + ChatColor.ITALIC 
				+ "Select the GameMode you want to play!");
		ItemStack s = CI.createItem(Material.CHEST, 1, -1, ChatColor.DARK_AQUA + "Settings", "", ChatColor.AQUA.toString() + ChatColor.ITALIC + "Change your settings!");
		
		p.getInventory().setItem(27, i);
		p.getInventory().setItem(28, s);
	}
}
