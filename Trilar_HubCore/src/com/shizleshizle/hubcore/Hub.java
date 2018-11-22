package com.shizleshizle.hubcore;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.shizleshizle.hubcore.commands.ToggleInv;
import com.shizleshizle.hubcore.events.PJoin;

public class Hub extends JavaPlugin {
	
	public void onEnable() {
		Logger l = getLogger();
		l.info("Hub Core >> Enabling...");
		long t = System.currentTimeMillis();
		getCommand("toggleinv").setExecutor(new ToggleInv());
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PJoin(), this);
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
