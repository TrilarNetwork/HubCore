package com.shizleshizle.hubcore.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.shizleshizle.core.commands.Skulls;
import me.shizleshizle.core.objects.User;
import me.shizleshizle.core.utils.CI;
import net.md_5.bungee.api.ChatColor;

public class LGUI {

	public static void openServer(User p) {
		Inventory i = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Servers");
		
		p.openInventory(i);
	}
	
	public static void openSettings(User p) {
		Inventory i = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Settings");
		
		ItemStack pl;
		if (LH.canSeePlayers(p)) {
			pl = CI.createItem(Material.WOOL, 1, 13, ChatColor.GREEN + "Hide Players", "", ChatColor.AQUA + "Click here to hide players!");
		} else {
			pl = CI.createItem(Material.WOOL, 1, 14, ChatColor.GREEN + "Show Players", "", ChatColor.AQUA + "Click here to show players!");
		}
		ItemStack armor = CI.createItem(Material.DIAMOND_CHESTPLATE, 1, -1, ChatColor.DARK_AQUA + "Armor", "", ChatColor.GRAY + "Click here to go to the Armor menu!");
		ItemStack hats = CI.createItem(Material.SKULL_ITEM, 1, 0, ChatColor.WHITE + "Hats", ChatColor.GRAY + "Click here to go to the Hats menu!");
		
		i.setItem(10, hats);
		i.setItem(14, armor);
		i.setItem(16, pl);
		p.openInventory(i);
	}
	
	public static void openHats(User p) {
		Inventory i = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 1/2");
		
		ItemStack notch = Skulls.getSkull("Notch", 1, ChatColor.GOLD + "Notch's Head"); 
		ItemStack shizle = Skulls.getSkull("shizleshizle", 1, ChatColor.DARK_AQUA + "shizleshizle's Head", ChatColor.GRAY + "Lead-Developer Head"); 
		ItemStack melvin = Skulls.getSkull("iMelvin", 1, ChatColor.AQUA + "iMelvin's Head", ChatColor.GRAY + "Developer Head");
		ItemStack bradley = Skulls.getSkull("Tvoh19", 1, ChatColor.RED + "Tvoh19's Head", ChatColor.GRAY + "Owner Head");
		ItemStack guillian = Skulls.getSkull("JrGuillian", 1, ChatColor.YELLOW + "JrGuillian's Head", ChatColor.GRAY + "Admin Head");
		ItemStack luuk = Skulls.getSkull("LuMaNia", 1, ChatColor.DARK_RED + "LuMaNia's Head", ChatColor.GRAY + "Staff-Lead Head");
		ItemStack sand = CI.createItem(Material.SAND, 1, -1, "Sand head");
		
		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		
		i.setItem(10, notch);
		i.setItem(12, shizle);
		i.setItem(14, melvin);
		i.setItem(16, bradley);
		i.setItem(20, guillian);
		i.setItem(22, luuk);
		i.setItem(24, sand);
		// 28, 30, 32, 34, 38, 40, 42
		i.setItem(49, backToSettings);
		i.setItem(50, close);
		i.setItem(53, next);
		p.openInventory(i);
	}
	
	public static void openHats2(User p) {
		Inventory i = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 2/2");
		
		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack prev = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page!");
		
		i.setItem(45, prev);
		i.setItem(49, backToSettings);
		i.setItem(50, close);
		i.setItem(53, next);
		p.openInventory(i);
	}
	
	public static void openArmor(User p) {
		Inventory i = Bukkit.createInventory(null,  54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Armor");
		
		ItemStack lh = CI.createItem(Material.LEATHER_HELMET, 1, -1, ChatColor.YELLOW + "Leather Helmet");
		ItemStack lc = CI.createItem(Material.LEATHER_CHESTPLATE, 1, -1, ChatColor.YELLOW + "Leather Chestplate");
		ItemStack ll = CI.createItem(Material.LEATHER_LEGGINGS, 1, -1, ChatColor.YELLOW + "Leather Leggings");
		ItemStack lb = CI.createItem(Material.LEATHER_BOOTS, 1, -1, ChatColor.YELLOW + "Leather Boots");
		
		ItemStack ch = CI.createItem(Material.CHAINMAIL_HELMET, 1, -1, ChatColor.GRAY + "Chainmail Helmet");
		ItemStack cc = CI.createItem(Material.CHAINMAIL_CHESTPLATE, 1, -1, ChatColor.GRAY + "Chainmail Chestplate");
		ItemStack cl = CI.createItem(Material.CHAINMAIL_LEGGINGS, 1, -1, ChatColor.GRAY + "Chainmail Leggings");
		ItemStack cb = CI.createItem(Material.CHAINMAIL_BOOTS, 1, -1, ChatColor.GRAY + "Chainmail Boots");
		
		ItemStack ih = CI.createItem(Material.IRON_HELMET, 1, -1, ChatColor.DARK_GRAY + "Iron Helmet");
		ItemStack ic = CI.createItem(Material.IRON_CHESTPLATE, 1, -1, ChatColor.DARK_GRAY + "Iron Chestplate");
		ItemStack il = CI.createItem(Material.IRON_LEGGINGS, 1, -1, ChatColor.DARK_GRAY + "Iron Leggings");
		ItemStack ib = CI.createItem(Material.IRON_BOOTS, 1, -1, ChatColor.DARK_GRAY + "Iron Boots");
		
		ItemStack gh = CI.createItem(Material.GOLD_HELMET, 1, -1, ChatColor.DARK_GRAY + "Gold Helmet");
		ItemStack gc = CI.createItem(Material.GOLD_CHESTPLATE, 1, -1, ChatColor.DARK_GRAY + "Gold Chestplate");
		ItemStack gl = CI.createItem(Material.GOLD_LEGGINGS, 1, -1, ChatColor.DARK_GRAY + "Gold Leggings");
		ItemStack gb = CI.createItem(Material.GOLD_BOOTS, 1, -1, ChatColor.DARK_GRAY + "Gold Boots");
		
		ItemStack dh = CI.createItem(Material.DIAMOND_HELMET, 1, -1, ChatColor.DARK_GRAY + "Diamond Helmet");
		ItemStack dc = CI.createItem(Material.DIAMOND_CHESTPLATE, 1, -1, ChatColor.DARK_GRAY + "Diamond Chestplate");
		ItemStack dl = CI.createItem(Material.DIAMOND_LEGGINGS, 1, -1, ChatColor.DARK_GRAY + "Diamond Leggings");
		ItemStack db = CI.createItem(Material.DIAMOND_BOOTS, 1, -1, ChatColor.DARK_GRAY + "Diamond Boots");
		
		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack disco = CI.createItem(Material.INK_SACK, 1, 0, ChatColor.DARK_PURPLE + "Disco Armor", ChatColor.GRAY + "Click here to use disco armor (Leather armor only)");
		
		i.setItem(9, lh);
		i.setItem(18, lc);
		i.setItem(27, ll);
		i.setItem(36, lb);
		
		i.setItem(11, ch);
		i.setItem(20, cc);
		i.setItem(29, cl);
		i.setItem(38, cb);
		
		i.setItem(13, ih);
		i.setItem(22, ic);
		i.setItem(31, il);
		i.setItem(40, ib);
		
		i.setItem(15, gh);
		i.setItem(24, gc);
		i.setItem(33, gl);
		i.setItem(42, gb);
		
		i.setItem(17, dh);
		i.setItem(26, dc);
		i.setItem(35, dl);
		i.setItem(44, db);
		
		i.setItem(50, close);
		i.setItem(49, backToSettings);
		i.setItem(48, disco);
		p.openInventory(i);
	}
}
