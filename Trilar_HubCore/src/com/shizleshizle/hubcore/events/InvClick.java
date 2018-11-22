package com.shizleshizle.hubcore.events;

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
				}
			}
		}
	}
}