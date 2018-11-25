package com.shizleshizle.hubcore.utils;

import com.shizleshizle.hubcore.commands.Disco;
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
	
	public static void openSkulls(User p) {
		Inventory i = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 1/8");
		
		ItemStack notch = Skulls.getSkull("Notch", 1, ChatColor.GOLD + "Notch's Head"); 
		ItemStack shizle = Skulls.getSkull("shizleshizle", 1, ChatColor.DARK_AQUA + "shizleshizle's Head", ChatColor.GRAY + "Lead-Developer Head"); 
		ItemStack melvin = Skulls.getSkull("iMelvin", 1, ChatColor.AQUA + "iMelvin's Head", ChatColor.GRAY + "Developer Head");
		ItemStack bradley = Skulls.getSkull("Tvoh19", 1, ChatColor.RED + "Tvoh19's Head", ChatColor.GRAY + "Owner Head");
		ItemStack guillian = Skulls.getSkull("JrGuillian", 1, ChatColor.YELLOW + "JrGuillian's Head", ChatColor.GRAY + "Admin Head");
		ItemStack luuk = Skulls.getSkull("LuMaNia", 1, ChatColor.DARK_RED + "LuMaNia's Head", ChatColor.GRAY + "Staff-Lead Head");
		
		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for skulls.");

		i.setItem(0, info);
		i.setItem(10, notch);
		i.setItem(12, shizle);
		i.setItem(14, melvin);
		i.setItem(16, bradley);
		i.setItem(20, guillian);
		i.setItem(22, luuk);
		i.setItem(49, backToSettings);
		i.setItem(50, close);
		i.setItem(53, next);
		p.openInventory(i);
	}

	public static void openWoodTypes(User p) {
		Inventory w = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 2/8");

		ItemStack oak = CI.createItem(Material.LOG, 1, 0, ChatColor.GOLD + "Oak Wood");
		ItemStack spruce = CI.createItem(Material.LOG, 1, 1, ChatColor.DARK_GRAY + "Spruce Wood");
		ItemStack birch = CI.createItem(Material.LOG, 1, 2,ChatColor.WHITE + "Birch Wood");
		ItemStack jungle = CI.createItem(Material.LOG, 1, 3, ChatColor.GREEN + "Jungle Wood");
		ItemStack acacia = CI.createItem(Material.LOG_2, 1, 0, ChatColor.RED + "Acacia Wood");
		ItemStack darkoak = CI.createItem(Material.LOG_2, 1, 1, ChatColor.BLACK + "Dark Oak Wood");

		ItemStack oakp = CI.createItem(Material.WOOD, 1, 0, ChatColor.GOLD + "Oak Wood Planks");
		ItemStack sprucep = CI.createItem(Material.WOOD, 1, 1, ChatColor.DARK_GRAY + "Spruce Wood Planks");
		ItemStack birchp = CI.createItem(Material.WOOD, 1, 2, ChatColor.WHITE + "Birch Wood Planks");
		ItemStack junglep = CI.createItem(Material.WOOD, 1, 3, ChatColor.GREEN + "Jungle Wood Planks");
		ItemStack acaciap = CI.createItem(Material.WOOD, 1, 4, ChatColor.RED + "Acacia Wood Planks");
		ItemStack darkoakp = CI.createItem(Material.WOOD, 1, 5, ChatColor.BLACK + "Dark Oak Wood Planks");

		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack back = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page!");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for wood types.");

		w.setItem(0, info);
		w.setItem(10, oak);
		w.setItem(12, spruce);
		w.setItem(14, birch);
		w.setItem(16, jungle);
		w.setItem(20, acacia);
		w.setItem(22, darkoak);
		w.setItem(24, acaciap);
		w.setItem(29, darkoakp);
		w.setItem(31, oakp);
		w.setItem(33, sprucep);
		w.setItem(39, birchp);
		w.setItem(41, junglep);
		w.setItem(45, back);
		w.setItem(49, backToSettings);
		w.setItem(50, close);
		w.setItem(53, next);
		p.openInventory(w);
	}
	
	public static void openArmor(User p) {
		Inventory i = Bukkit.createInventory(null,  54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 3/8");
		
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
		ItemStack disco;
		if (Disco.hasDisco(p)) {
			disco = CI.createItem(Material.SLIME_BLOCK, 1, 0, ChatColor.DARK_PURPLE + "Disco Armor", ChatColor.GRAY + "Click here to disable disco armor.");
		} else {
			disco = CI.createItem(Material.COAL_BLOCK, 1, 0, ChatColor.DARK_PURPLE + "Disco Armor", ChatColor.GRAY + "Click here to enable disco armor (Leather armor only).");
		}
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack back = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for armor.");

		i.setItem(0, info);
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

		i.setItem(45, back);
		i.setItem(48, disco);
		i.setItem(49, backToSettings);
		i.setItem(50, close);
		i.setItem(53, next);
		p.openInventory(i);
	}

	public static void openBlockTypes(User p) {
		Inventory i = Bukkit.createInventory(null, 45, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 4/8");

		ItemStack e = CI.createItem(Material.EMERALD_BLOCK, 1, -1, ChatColor.DARK_GREEN + "Emerald Block");
		ItemStack d = CI.createItem(Material.DIAMOND_BLOCK, 1, -1, ChatColor.DARK_AQUA + "Diamond Block");
		ItemStack g = CI.createItem(Material.GOLD_BLOCK, 1, -1, ChatColor.GOLD + "Gold Block");
		ItemStack r = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Redstone Block");
		ItemStack ir = CI.createItem(Material.IRON_BLOCK, 1, -1, ChatColor.WHITE + "Iron Block");
		ItemStack l = CI.createItem(Material.LAPIS_BLOCK, 1, -1, ChatColor.DARK_BLUE + "Lapis Lazuli Block");
		ItemStack c = CI.createItem(Material.COAL_BLOCK, 1, -1, ChatColor.BLACK + "Coal Block");

		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack back = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for block types.");

		i.setItem(0, info);
		i.setItem(10, e);
		i.setItem(12, d);
		i.setItem(14, g);
		i.setItem(16, r);
		i.setItem(20, ir);
		i.setItem(22, l);
		i.setItem(24, c);
		i.setItem(36, back);
		i.setItem(40, backToSettings);
		i.setItem(41, close);
		i.setItem(44, next);
		p.openInventory(i);
	}

	public static void openOreTypes(User p) {
		Inventory o = Bukkit.createInventory(null, 45, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 5/8");

		ItemStack e = CI.createItem(Material.EMERALD_ORE, 1, -1, ChatColor.DARK_GREEN + "Emerald Ore");
		ItemStack d = CI.createItem(Material.DIAMOND_ORE, 1, -1, ChatColor.DARK_AQUA + "Diamond Ore");
		ItemStack g = CI.createItem(Material.GOLD_ORE, 1, -1, ChatColor.GOLD + "Gold Ore");
		ItemStack i = CI.createItem(Material.IRON_ORE, 1, -1, ChatColor.WHITE + "Iron Ore");
		ItemStack r = CI.createItem(Material.REDSTONE_ORE, 1, -1, ChatColor.RED + "Redstone Ore");
		ItemStack l = CI.createItem(Material.LAPIS_ORE, 1, -1, ChatColor.DARK_BLUE + "Lapis Lazuli Ore");
		ItemStack c = CI.createItem(Material.COAL_ORE, 1, -1, ChatColor.BLACK + "Coal Ore");

		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack back = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for block types.");

		o.setItem(0, info);
		o.setItem(10, e);
		o.setItem(12, d);
		o.setItem(14, g);
		o.setItem(16, i);
		o.setItem(20, r);
		o.setItem(22, l);
		o.setItem(24, c);
		o.setItem(36, back);
		o.setItem(40, backToSettings);
		o.setItem(41, close);
		o.setItem(44, next);
		p.openInventory(o);
	}

	public static void openGlassTypes(User p) {
		Inventory inv = Bukkit.createInventory(null, 54, ChatColor.GOLD.toString() + ChatColor.BOLD + "Hats Page 6/8");

		ItemStack neutral = CI.createItem(Material.GLASS, 1, -1, ChatColor.AQUA + "Glass");
		ItemStack white = CI.createItem(Material.STAINED_GLASS, 1, 0, ChatColor.WHITE + "White Stained Glass");
		ItemStack orange = CI.createItem(Material.STAINED_GLASS, 1, 1, ChatColor.GOLD + "Orange Stained Glass");
		ItemStack magenta = CI.createItem(Material.STAINED_GLASS, 1, 2, ChatColor.LIGHT_PURPLE + "Magenta Stained Glass");
		ItemStack lightblue = CI.createItem(Material.STAINED_GLASS, 1, 3, ChatColor.AQUA + "Light Blue Stained Glass");
		ItemStack yellow = CI.createItem(Material.STAINED_GLASS, 1, 4, ChatColor.YELLOW + "Yellow Stained Glass");
		ItemStack lime = CI.createItem(Material.STAINED_GLASS, 1, 5, ChatColor.GREEN + "Lime Stained Glass");
		ItemStack pink = CI.createItem(Material.STAINED_GLASS, 1, 6, ChatColor.LIGHT_PURPLE + "Pink Stained Glass");
		ItemStack darkgray = CI.createItem(Material.STAINED_GLASS, 1, 7, ChatColor.DARK_GRAY + "Dark Gray Stained Glass");
		ItemStack lightgray = CI.createItem(Material.STAINED_GLASS, 1, 8, ChatColor.GRAY + "Gray Stained Glass");
		ItemStack cyan = CI.createItem(Material.STAINED_GLASS, 1, 9, ChatColor.DARK_AQUA + "Cyan Stained Glass");
		ItemStack purple = CI.createItem(Material.STAINED_GLASS, 1, 10, ChatColor.DARK_PURPLE + "Purple Stained Glass");
		ItemStack blue = CI.createItem(Material.STAINED_GLASS, 1, 11, ChatColor.DARK_BLUE + "Blue Stained Glass");
		ItemStack brown = CI.createItem(Material.STAINED_GLASS, 1, 12, ChatColor.DARK_GRAY + "Brown Stained Glass");
		ItemStack green = CI.createItem(Material.STAINED_GLASS, 1, 13, ChatColor.DARK_GREEN + "Green Stained Glass");
		ItemStack red = CI.createItem(Material.STAINED_GLASS, 1, 14, ChatColor.RED + "Red Stained Glass");
		ItemStack black = CI.createItem(Material.STAINED_GLASS, 1, 15, ChatColor.BLACK + "Black Stained Glass");

		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack back = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for block types.");

		inv.setItem(0, neutral);
		inv.setItem(2, white);
		inv.setItem(4, orange);
		inv.setItem(6, magenta);
		inv.setItem(8, lightblue);
		inv.setItem(10, yellow);
		inv.setItem(12, lime);
		inv.setItem(14, pink);
		inv.setItem(16, darkgray);
		inv.setItem(20, lightgray);
		inv.setItem(22, cyan);
		inv.setItem(24, purple);
		inv.setItem(30, blue);
		inv.setItem(32, brown);
		inv.setItem(38, green);
		inv.setItem(40, red);
		inv.setItem(42, black);

		inv.setItem(45, back);
		inv.setItem(48, info);
		inv.setItem(49, backToSettings);
		inv.setItem(50, close);
		inv.setItem(53, next);
		p.openInventory(inv);
	}

	public static void openSandTypes(User p) {
		Inventory s = Bukkit.createInventory(null, 36, ChatColor.GOLD.toString() + ChatColor.BOLD + "Sand Types");

		ItemStack sand = CI.createItem(Material.SAND, 1, 0, ChatColor.YELLOW + "Sand"); // normal
		ItemStack sstone = CI.createItem(Material.SANDSTONE, 1, 0, ChatColor.YELLOW + "Sandstone"); // sandstone
		ItemStack sc = CI.createItem(Material.SANDSTONE, 1, 1, ChatColor.YELLOW + "Chiselled Sandstone"); // chiselled
		ItemStack ssm = CI.createItem(Material.SANDSTONE, 1, 2, ChatColor.YELLOW + "Smooth Sandstone"); // smooth
		ItemStack rsand = CI.createItem(Material.SAND, 1, 1, ChatColor.RED + "Red Sand"); // red sand
		ItemStack rs = CI.createItem(Material.RED_SANDSTONE, 1, 0, ChatColor.RED + "Red Sandstone"); // red sandstone
		ItemStack rsc = CI.createItem(Material.RED_SANDSTONE, 1, 1, ChatColor.RED + "Red Chiselled Sandstone"); // red chiselled
		ItemStack rsm = CI.createItem(Material.RED_SANDSTONE, 1, 2, ChatColor.RED + "Smooth Red Sandstone"); // smooth
		ItemStack ss = CI.createItem(Material.SOUL_SAND, 1, -1, ChatColor.DARK_GRAY + "Soul Sand");

		ItemStack backToSettings = CI.createItem(Material.WOOD_DOOR, 1, -1, ChatColor.GOLD + "Settings", ChatColor.GRAY + "Click here to go back to settings!");
		ItemStack close = CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Close", ChatColor.GRAY + "Click here to close a menu!");
		ItemStack next = Skulls.getSkull("MHF_ArrowRight", 1, ChatColor.BLACK + "Next Page", ChatColor.GRAY + "Go to the next page!");
		ItemStack back = Skulls.getSkull("MHF_Arrowleft", 1, ChatColor.BLACK + "Previous Page", ChatColor.GRAY + "Go to the previous page");
		ItemStack info = CI.createItem(Material.SIGN_POST, 1, -1, ChatColor.GOLD + "Info", ChatColor.GRAY + "This is the menu for block types.");
		//hats: skulls -> woodtypes -> armor -> blocktypes -> oretypes -> glass -> sand -> other

		s.setItem(0, sand);
		s.setItem(10, sstone);
		s.setItem(20, sc);
		s.setItem(30, ssm);
		s.setItem(8, rsand);
		s.setItem(16, rs);
		s.setItem(24, rsc);
		s.setItem(32, rsm);
		s.setItem(22, ss);

		s.setItem(27, back);
		s.setItem(30, info);
		s.setItem(31, backToSettings);
		s.setItem(32, close);
		s.setItem(35, next);
		p.openInventory(s);
	}
}
