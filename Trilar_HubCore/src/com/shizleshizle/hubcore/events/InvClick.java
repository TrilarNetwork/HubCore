package com.shizleshizle.hubcore.events;

import com.shizleshizle.hubcore.commands.Disco;
import me.shizleshizle.core.commands.Skulls;
import me.shizleshizle.core.utils.CI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.shizleshizle.hubcore.utils.LGUI;
import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;
import net.md_5.bungee.api.ChatColor;

public class InvClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getWhoClicked() instanceof Player) {
			User p = new User((Player) e.getWhoClicked());
			if (LH.isDisabled(p)) {
				e.setCancelled(true);
			}
			ItemStack i = e.getCurrentItem();
			if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Servers")) {
				e.setCancelled(true);
				
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Settings")) {
				e.setCancelled(true);
				if (i.getType() == Material.WOOL) {
					if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Hide Players")) {
						e.setCancelled(true);
						for (Player pl : Bukkit.getOnlinePlayers()) {
							p.hideUser(new User(pl));
						}
						p.closeInventory();
						LGUI.openSettings(p);
					} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Show Players")) {
						e.setCancelled(true);
						for (Player pl : Bukkit.getOnlinePlayers()) {
							p.showUser(new User(pl));
						}
						p.closeInventory();
						LGUI.openSettings(p);
					}
				} else if (i.getType() == Material.DIAMOND_CHESTPLATE) {
					p.closeInventory();
					LGUI.openArmor(p);
				} else if (i.getType() == Material.SKULL_ITEM) {
					p.closeInventory();
					LGUI.openSkulls(p);
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 1/8")) {
				e.setCancelled(true);
				if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Notch's Head")) {
					p.closeInventory();
					p.setHat(Skulls.getSkull("Notch", 1, ChatColor.GOLD + "Notch's Head"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("shizleshizle's Head")) {
					p.closeInventory();
					p.setHat(Skulls.getSkull("shizleshizle", 1, ChatColor.DARK_AQUA + "shizleshizle's Head", ChatColor.GRAY + "Lead-Developer Head"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("iMelvin's Head")) {
					p.closeInventory();
					p.setHat(Skulls.getSkull("iMelvin", 1, ChatColor.AQUA + "iMelvin's Head", ChatColor.GRAY + "Developer Head"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Tvoh19's Head")) {
					p.closeInventory();
					p.setHat(Skulls.getSkull("Tvoh19", 1, ChatColor.RED + "Tvoh19's Head", ChatColor.GRAY + "Owner Head"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("JrGuillian's Head")) {
					p.closeInventory();
					p.setHat(Skulls.getSkull("JrGuillian", 1, ChatColor.YELLOW + "JrGuillian's Head", ChatColor.GRAY + "Admin Head"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("LuMaNia's Head")) {
					p.closeInventory();
					p.setHat(Skulls.getSkull("LuMaNia", 1, ChatColor.DARK_RED + "LuMaNia's Head", ChatColor.GRAY + "Staff-Lead Head"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (i.getType() == Material.REDSTONE_BLOCK) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					LGUI.openWoodTypes(p);
					// skulls -> woodtypes
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 2/8")) {
				e.setCancelled(true);
				if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Oak Wood")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LOG, 1, 0, ChatColor.GOLD + "Oak Wood"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Spruce Wood")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LOG, 1, 1, ChatColor.DARK_GRAY + "Spruce Wood"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Birch Wood")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LOG, 1, 2,ChatColor.WHITE + "Birch Wood"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Jungle Wood")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LOG, 1, 3, ChatColor.GREEN + "Jungle Wood"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Acacia Wood")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LOG_2, 1, 0, ChatColor.RED + "Acacia Wood"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Dark Oak Wood")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LOG_2, 1, 1, ChatColor.BLACK + "Dark Oak Wood"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Oak Wood Planks")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.WOOD, 1, 0, ChatColor.GOLD + "Oak Wood Planks"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Spruce Wood Planks")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.WOOD, 1, 1, ChatColor.DARK_GRAY + "Spruce Wood Planks"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Birch Wood Planks")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.WOOD, 1, 2, ChatColor.WHITE + "Birch Wood Planks"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Jungle Wood Planks")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.WOOD, 1, 3, ChatColor.GREEN + "Jungle Wood Planks"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Acacia Wood Planks")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.WOOD, 1, 4, ChatColor.RED + "Acacia Wood Planks"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Dark Oak Wood Planks")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.WOOD, 1, 5, ChatColor.BLACK + "Dark Oak Wood Planks"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (i.getType() == Material.REDSTONE_BLOCK) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					LGUI.openArmor(p);
					// woodtypes -> armor
				}  else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Previous Page")) {
					p.closeInventory();
					LGUI.openSkulls(p);
					// woodtypes -> skulls
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 3/8")) {
				e.setCancelled(true);
				if (i.getType() == Material.LEATHER_HELMET) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LEATHER_HELMET, 1, -1, ChatColor.YELLOW + "Leather Helmet"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.LEATHER_CHESTPLATE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LEATHER_CHESTPLATE, 1, -1, ChatColor.YELLOW + "Leather Chestplate"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.LEATHER_LEGGINGS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LEATHER_LEGGINGS, 1, -1, ChatColor.YELLOW + "Leather Leggings"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.LEATHER_BOOTS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LEATHER_BOOTS, 1, -1, ChatColor.YELLOW + "Leather Boots"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.CHAINMAIL_HELMET) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.CHAINMAIL_HELMET, 1, -1, ChatColor.GRAY + "Chainmail Helmet"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.CHAINMAIL_CHESTPLATE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.CHAINMAIL_CHESTPLATE, 1, -1, ChatColor.GRAY + "Chainmail Chestplate"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.CHAINMAIL_LEGGINGS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.CHAINMAIL_LEGGINGS, 1, -1, ChatColor.GRAY + "Chainmail Leggings"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.CHAINMAIL_BOOTS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.CHAINMAIL_BOOTS, 1, -1, ChatColor.GRAY + "Chainmail Boots"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.IRON_HELMET) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.IRON_HELMET, 1, -1, ChatColor.DARK_GRAY + "Iron Helmet"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.IRON_CHESTPLATE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.IRON_CHESTPLATE, 1, -1, ChatColor.DARK_GRAY + "Iron Chestplate"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.IRON_LEGGINGS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.IRON_LEGGINGS, 1, -1, ChatColor.DARK_GRAY + "Iron Leggings"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.IRON_BOOTS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.IRON_BOOTS, 1, -1, ChatColor.DARK_GRAY + "Iron Boots"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.GOLD_HELMET) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GOLD_HELMET, 1, -1, ChatColor.DARK_GRAY + "Gold Helmet"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.GOLD_CHESTPLATE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GOLD_CHESTPLATE, 1, -1, ChatColor.DARK_GRAY + "Gold Chestplate"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.GOLD_LEGGINGS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GOLD_LEGGINGS, 1, -1, ChatColor.DARK_GRAY + "Gold Leggings"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.GOLD_BOOTS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GOLD_BOOTS, 1, -1, ChatColor.DARK_GRAY + "Gold Boots"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.DIAMOND_HELMET) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.DIAMOND_HELMET, 1, -1, ChatColor.DARK_GRAY + "Diamond Helmet"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.DIAMOND_CHESTPLATE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.DIAMOND_CHESTPLATE, 1, -1, ChatColor.DARK_GRAY + "Diamond Chestplate"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.DIAMOND_LEGGINGS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.DIAMOND_LEGGINGS, 1, -1, ChatColor.DARK_GRAY + "Diamond Leggings"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.DIAMOND_BOOTS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.DIAMOND_BOOTS, 1, -1, ChatColor.DARK_GRAY + "Diamond Boots"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (i.getType() == Material.REDSTONE_BLOCK) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					LGUI.openBlockTypes(p);
					// armor -> blocktypes
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Previous Page")) {
					p.closeInventory();
					LGUI.openWoodTypes(p);
					// armor -> woodtypes
				} else if (i.getType() == Material.SLIME_BLOCK) {
					Disco.setDisco(p, false);
				} else if (i.getType() == Material.COAL_BLOCK) {
					Disco.setDisco(p, true);
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 4/8")) {
				e.setCancelled(true);
				if (i.getType() == Material.DIAMOND_BLOCK) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.DIAMOND_BLOCK, 1, -1, ChatColor.DARK_AQUA + "Diamond Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.GOLD_BLOCK) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GOLD_BLOCK, 1, -1, ChatColor.GOLD + "Gold Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Redstone Block")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.REDSTONE_BLOCK, 1, -1, ChatColor.RED + "Redstone Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.IRON_BLOCK) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.IRON_BLOCK, 1, -1, ChatColor.WHITE + "Iron Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.EMERALD_BLOCK) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.EMERALD_BLOCK, 1, -1, ChatColor.DARK_GREEN + "Emerald Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.LAPIS_BLOCK) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LAPIS_BLOCK, 1, -1, ChatColor.DARK_BLUE + "Lapis Lazuli Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.COAL_BLOCK) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.COAL_BLOCK, 1, -1, ChatColor.BLACK + "Coal Block"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Close")) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					LGUI.openOreTypes(p);
					// blocktypes -> oretypes
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Previous Page")) {
					p.closeInventory();
					LGUI.openArmor(p);
					// blocktypes -> armor
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 5/8")) {
				e.setCancelled(true);
				if (i.getType() == Material.EMERALD_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.EMERALD_ORE, 1, -1, ChatColor.DARK_GREEN + "Emerald Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.DIAMOND_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.DIAMOND_ORE, 1, -1, ChatColor.DARK_AQUA + "Diamond Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.GOLD_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GOLD_ORE, 1, -1, ChatColor.GOLD + "Gold Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.IRON_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.IRON_ORE, 1, -1, ChatColor.WHITE + "Iron Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.REDSTONE_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.REDSTONE_ORE, 1, -1, ChatColor.RED + "Redstone Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.LAPIS_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.LAPIS_ORE, 1, -1, ChatColor.DARK_BLUE + "Lapis Lazuli Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.COAL_ORE) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.COAL_ORE, 1, -1, ChatColor.BLACK + "Coal Ore"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (i.getType() == Material.REDSTONE_BLOCK) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					LGUI.openGlassTypes(p);
					// oretypes -> glasstypes
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Previous Page")) {
					p.closeInventory();
					LGUI.openArmor(p);
					// oretypes -> blocktypes
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 6/8")) {
				e.setCancelled(true);
				if (i.getType() == Material.GLASS) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.GLASS, 1, -1, ChatColor.AQUA + "Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("White")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 0, ChatColor.WHITE + "White Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Orange")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 1, ChatColor.GOLD + "Orange Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Magenta")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 2, ChatColor.LIGHT_PURPLE + "Magenta Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Light Blue")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 3, ChatColor.AQUA + "Light Blue Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Yellow")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 4, ChatColor.YELLOW + "Yellow Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Lime")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 5, ChatColor.GREEN + "Lime Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Pink")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 6, ChatColor.LIGHT_PURPLE + "Pink Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Dark Gray")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 7, ChatColor.DARK_GRAY + "Dark Gray Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Gray")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 8, ChatColor.GRAY + "Gray Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Cyan")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 9, ChatColor.DARK_AQUA + "Cyan Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Purple")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 10, ChatColor.DARK_PURPLE + "Purple Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Blue")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 11, ChatColor.DARK_BLUE + "Blue Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Brown")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 12, ChatColor.DARK_GRAY + "Brown Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Green")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 13, ChatColor.DARK_GREEN + "Green Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Red")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 14, ChatColor.RED + "Red Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Black")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.STAINED_GLASS, 1, 15, ChatColor.BLACK + "Black Stained Glass"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (i.getType() == Material.REDSTONE_BLOCK) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					LGUI.openSandTypes(p);
					// glasstypes -> sand
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Previous Page")) {
					p.closeInventory();
					LGUI.openOreTypes(p);
					// glasstypes -> oretypes
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 7/8")) {
				e.setCancelled(true);
				if (i.getType() == Material.SAND) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.SAND, 1, 0, ChatColor.YELLOW + "Sand"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Sandstone")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.SANDSTONE, 1, 0, ChatColor.YELLOW + "Sandstone"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Chiselled")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.SANDSTONE, 1, 1, ChatColor.YELLOW + "Chiselled Sandstone"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Smooth")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.SANDSTONE, 1, 2, ChatColor.YELLOW + "Smooth Sandstone"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Red")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.SAND, 1, 1, ChatColor.RED + "Red Sand"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Red Sandstone")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.RED_SANDSTONE, 1, 0, ChatColor.RED + "Red Sandstone"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Red Chiselled")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.RED_SANDSTONE, 1, 1, ChatColor.RED + "Red Chiselled Sandstone"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Smooth Red")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.RED_SANDSTONE, 1, 2, ChatColor.RED + "Smooth Red Sandstone"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).startsWith("Soul")) {
					p.closeInventory();
					p.setHat(CI.createItem(Material.SOUL_SAND, 1, -1, ChatColor.DARK_GRAY + "Soul Sand"));
					p.sendMessage(ChatColor.GOLD + "Enjoy!");
				} else if (i.getType() == Material.WOOD_DOOR) {
					p.closeInventory();
					LGUI.openSettings(p);
				} else if (i.getType() == Material.REDSTONE_BLOCK) {
					p.closeInventory();
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Next Page")) {
					p.closeInventory();
					//LGUI.openOther(p);
					// sand -> other
				} else if (ChatColor.stripColor(i.getItemMeta().getDisplayName()).equals("Previous Page")) {
					p.closeInventory();
					LGUI.openOreTypes(p);
					// sand -> glasstypes
				}
			} else if (ChatColor.stripColor(e.getClickedInventory().getTitle()).equals("Hats Page 8/8")) {
				e.setCancelled(true);
			}
		}
	}
}