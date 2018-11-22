package com.shizleshizle.hubcore.utils;

import java.util.ArrayList;

import me.shizleshizle.core.objects.User;

public class LH {
	private static ArrayList<String> inv = new ArrayList<>();
	private static ArrayList<String> nosee = new ArrayList<>();
	
	public static void enableInventory(User p) {
		if (!inv.contains(p.getName())) {
			inv.add(p.getName());
		}
	}
	
	public static void disableInventory(User p) {
		if (inv.contains(p.getName())) {
			inv.remove(p.getName());
		}
	}
	
	public static boolean isDisabled(User p) {
		return inv.contains(p.getName());
	}
	
	public static void hidePlayersFrom(User p) {
		if (!nosee.contains(p.getName())) {
			nosee.add(p.getName());
		}
	}
	
	public static void showPlayersFor(User p) {
		if (nosee.contains(p.getName())) {
			nosee.remove(p.getName());
		}
	}
	
	public static boolean canSeePlayers(User p) {
		return nosee.contains(p.getName());
	}
	
	public static ArrayList<String> getPlayers() {
		return nosee;
	}
}
