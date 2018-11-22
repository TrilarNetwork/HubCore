package com.shizleshizle.hubcore.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;

public class FChange  implements Listener {

	@EventHandler
	public void onFoodChange(FoodLevelChangeEvent e) {
		if (e.getEntity() instanceof Player) {
			User p = new User((Player) e.getEntity());
			if (LH.isDisabled(p)) {
				e.setCancelled(true);
			}
		}
	}
}