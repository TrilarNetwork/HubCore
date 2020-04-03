package com.shizleshizle.hubcore.commands;

import me.shizleshizle.core.objects.User;
import me.shizleshizle.core.permissions.Perm;
import me.shizleshizle.core.permissions.PermGroup;
import me.shizleshizle.core.utils.CI;
import me.shizleshizle.core.utils.ErrorMessages;
import me.shizleshizle.core.utils.ErrorMessages.Messages;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;
public class Disco implements CommandExecutor {
	private static ArrayList<String> disco = new ArrayList<>();
	private static final String PREFIX = ChatColor.YELLOW.toString() + ChatColor.BOLD + "Disco" + ChatColor.GOLD + " >> " + ChatColor.YELLOW;

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("disco")) {
			if (sender instanceof Player) {
				Player x = (Player) sender;
				User p = new User(x);
				if (Perm.hasPerm(p, PermGroup.MEMBER)) {
					if (args.length == 0) {
						if (hasDisco(p)) {
							setDisco(p, false);
							p.sendMessage(PREFIX + "Your disco armor has been disabled!");
						} else {
							PlayerInventory inv = p.getInventory();
							if (inv.contains(Material.LEATHER_BOOTS) || inv.contains(Material.LEATHER_CHESTPLATE) || inv.contains(Material.LEATHER_HELMET)
									|| inv.contains(Material.LEATHER_LEGGINGS)) {
								setDisco(p, true);
								p.sendMessage(PREFIX + "Groovy! Enjoy your disco armor!");
							} else {
								p.sendMessage(PREFIX + "Disco armor only works on leather.");
							}
						}
					} else if (args.length == 1) {
						Player tp = Bukkit.getPlayerExact(args[0]);
						if (tp.isOnline()) {
							User t = new User(tp);
							if (hasDisco(t)) {
								setDisco(t, false);
								t.sendMessage(PREFIX + "Your disco armor has been disabled!");
								p.sendMessage(PREFIX + "You have disabled " + ChatColor.YELLOW + args[0] + ChatColor.GOLD + "'s disco armor!");
							} else {
								PlayerInventory inv = t.getInventory();
								if (inv.contains(Material.LEATHER_BOOTS) || inv.contains(Material.LEATHER_CHESTPLATE) || inv.contains(Material.LEATHER_HELMET)
										|| inv.contains(Material.LEATHER_LEGGINGS)) {
									setDisco(t, true);
									t.sendMessage(PREFIX + "Groovy! Enjoy your disco armor!");
									p.sendMessage(PREFIX + "You have enabled " + ChatColor.YELLOW + args[0] + ChatColor.GOLD + "'s disco armor!");
								} else {
									p.sendMessage(PREFIX + "Disco armor only works on leather.");
								}
							}
						} else {
							ErrorMessages.doErrorMessage(p, Messages.PLAYER_OFFLINE, args[0]);
						}
					} else {
						ErrorMessages.doErrorMessage(p, Messages.INVALID_USAGE, "/disco");
					}
				} else {
					ErrorMessages.doErrorMessage(p, Messages.NOPERM, "/disco");
				}
			} else {
				sender.sendMessage("You must be a player to perform this command!");
			}
		}
		return false;

	}

	public static void setDisco(User p, boolean d) {
		if (d) {
			if(!disco.contains(p.getName())) {
				disco.add(p.getName());
			}
		} else {
			disco.remove(p.getName());
			PlayerInventory inv = p.getInventory();
			if (inv.getHelmet().getType() == Material.LEATHER_HELMET) {
				inv.setHelmet(CI.createItem(Material.LEATHER_HELMET, 1, -1, ChatColor.YELLOW + "Leather Helmet"));
			}
			if (inv.getChestplate().getType() == Material.LEATHER_CHESTPLATE) {
				inv.setChestplate(CI.createItem(Material.LEATHER_CHESTPLATE, 1, -1, ChatColor.YELLOW + "Leather Chestplate"));
			}
			if (inv.getLeggings().getType() == Material.LEATHER_LEGGINGS) {
				inv.setLeggings(CI.createItem(Material.LEATHER_LEGGINGS, 1, -1, ChatColor.YELLOW + "Leather Leggings"));
			}
			if (inv.getBoots().getType() == Material.LEATHER_BOOTS) {
				inv.setBoots(CI.createItem(Material.LEATHER_BOOTS, 1, -1, ChatColor.YELLOW + "Leather Boots"));
			}
		}
	}

	public static boolean hasDisco(User p) {
		return disco.contains(p.getName());
	}
}
