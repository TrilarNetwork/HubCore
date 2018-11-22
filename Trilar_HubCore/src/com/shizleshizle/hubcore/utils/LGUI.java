package com.shizleshizle.hubcore.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.shizleshizle.core.objects.User;
import me.shizleshizle.core.utils.CI;
import net.md_5.bungee.api.ChatColor;

public class LGUI {

	public static void openServer(User p) {
		Inventory i = Bukkit.createInventory(null, 56, ChatColor.GOLD.toString() + ChatColor.BOLD + "Servers");
		
		p.openInventory(i);
	}
	
	public static void openSettings(User p) {
		Inventory i = Bukkit.createInventory(null, 56, ChatColor.GOLD.toString() + ChatColor.BOLD + "Settings");
		
		ItemStack pl;
		if (LH.canSeePlayers(p)) {
			pl = CI.createItem(Material.WOOL, 1, 13, ChatColor.GREEN + "Hide Players", "", ChatColor.AQUA + "Click here to hide players!");
		} else {
			pl = CI.createItem(Material.WOOL, 1, 14, ChatColor.GREEN + "Show Players", "", ChatColor.AQUA + "Click here to show players!");
		}
		
		i.setItem(15, pl);
		p.openInventory(i);
	}
}
