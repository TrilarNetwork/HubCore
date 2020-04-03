package com.shizleshizle.hubcore;

import java.util.logging.Logger;

import com.shizleshizle.hubcore.commands.Disco;
import com.shizleshizle.hubcore.events.*;
import com.shizleshizle.hubcore.utils.DiscoRunner;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.shizleshizle.hubcore.commands.ToggleInv;

public class Hub extends JavaPlugin {
	
	public void onEnable() {
		Logger l = getLogger();
		l.info("Hub Core >> Enabling...");
		long t = System.currentTimeMillis();
		getCommand("toggleinv").setExecutor(new ToggleInv());
		getCommand("disco").setExecutor(new Disco());
		registerEvents();
		DiscoRunner dr = new DiscoRunner();
		dr.run();
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

	private void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BBreak(), this);
		pm.registerEvents(new BPlace(), this);
		pm.registerEvents(new EDamage(), this);
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
	}
}
