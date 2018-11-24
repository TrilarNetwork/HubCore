package com.shizleshizle.hubcore.utils;

import com.shizleshizle.hubcore.commands.Disco;
import me.shizleshizle.core.objects.User;
import me.shizleshizle.core.utils.CI;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import java.util.Random;
public class DiscoRunner implements Runnable {

	@Override
	public void run() {
		Random r = new Random();
		Color c = Color.fromBGR(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		for (Player pl : Bukkit.getOnlinePlayers()) {
			User p = new User(pl);
			if (Disco.hasDisco(p)) {
				PlayerInventory pi = p.getInventory();
				if (pi.getHelmet() != null && pi.getHelmet().getType() == Material.LEATHER_HELMET) {
					pi.setHelmet(CI.getColorArmor(Material.LEATHER_HELMET, c));
				}
				if (pi.getChestplate() != null && pi.getHelmet().getType() == Material.LEATHER_CHESTPLATE) {
					pi.setHelmet(CI.getColorArmor(Material.LEATHER_CHESTPLATE, c));
				}
				if (pi.getLeggings() != null && pi.getHelmet().getType() == Material.LEATHER_LEGGINGS) {
					pi.setHelmet(CI.getColorArmor(Material.LEATHER_LEGGINGS, c));
				}
				if (pi.getBoots() != null && pi.getHelmet().getType() == Material.LEATHER_BOOTS) {
					pi.setHelmet(CI.getColorArmor(Material.LEATHER_BOOTS, c));
				}
			}
		}
 	}
}
