package com.shizleshizle.hubcore.utils;

import java.util.ArrayList;

import me.shizleshizle.core.objects.User;

public class LobbyHandler {
	private static ArrayList<String> inv = new ArrayList<>();
	
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
}
