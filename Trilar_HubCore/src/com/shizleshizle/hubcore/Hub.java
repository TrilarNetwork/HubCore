package com.shizleshizle.hubcore;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.shizleshizle.hubcore.commands.ToggleInv;
import com.shizleshizle.hubcore.events.BBreak;
import com.shizleshizle.hubcore.events.BPlace;
import com.shizleshizle.hubcore.events.FChange;
import com.shizleshizle.hubcore.events.InvClick;
import com.shizleshizle.hubcore.events.InvMove;
import com.shizleshizle.hubcore.events.MSpawn;
import com.shizleshizle.hubcore.events.PDeath;
import com.shizleshizle.hubcore.events.PDropPickup;
import com.shizleshizle.hubcore.events.PInteract;
import com.shizleshizle.hubcore.events.PJoin;
import com.shizleshizle.hubcore.events.PQuit;
import com.shizleshizle.hubcore.events.WChange;

public class Hub extends JavaPlugin {
	
	public void onEnable() {
		Logger l = getLogger();
		l.info("Hub Core >> Enabling...");
		long t = System.currentTimeMillis();
		getCommand("toggleinv").setExecutor(new ToggleInv());
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BBreak(), this);
		pm.registerEvents(new BPlace(), this);
		pm.registerEvents(new FChange(), this);
		pm.registerEvents(new InvClick(), this);
		pm.registerEvents(new InvMove(), this);
		pm.registerEvents(new MSpawn(), this);
		pm.registerEvents(new PDeath(), this);
		pm.registerEvents(new PDropPickup(), this);
		pm.registerEvents(new PInteract(), this);
		pm.registerEvents(new PJoin(), this);
		pm.registerEvents(new PQuit(), this);
		pm.registerEvents(new WChange(), this);
		long f = System.currentTimeMillis() - t;
		l.info("Hub Core >> Enabled! (" + f + " ms)");
	}
	
	public void onDisable() {
		Logger l = getLogger();
		l.info("Hub Core >> Disabling...");
		long t = System.currentTimeMillis();
		
		long f = System.currentTimeMillis() - t;
		l.info("Hub Core >> Disabled! (" + f + " ms)");
	}
}
