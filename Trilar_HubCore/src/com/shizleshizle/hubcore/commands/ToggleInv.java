package com.shizleshizle.hubcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.shizleshizle.hubcore.utils.LH;

import me.shizleshizle.core.objects.User;
import me.shizleshizle.core.permissions.Perm;
import me.shizleshizle.core.permissions.PermGroup;
import me.shizleshizle.core.utils.ErrorMessages;
import me.shizleshizle.core.utils.ErrorMessages.Messages;

public class ToggleInv implements CommandExecutor {
	private static String prefix = ChatColor.YELLOW.toString() + ChatColor.BOLD + "Lobby Inventory" + ChatColor.GOLD + " >> " + ChatColor.YELLOW;

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("toggleinv")) {
			if (sender instanceof Player) {
				Player x = (Player) sender;
				User p = new User(x);
				if (Perm.hasPerm(p, PermGroup.MEMBER)) {
					if (args.length == 0) {
						if (LH.isDisabled(p)) {
							LH.enableInventory(p);
							p.sendMessage(prefix + "Your inventory has been enabled!");
						} else {
							LH.disableInventory(p);
							p.sendMessage(prefix + "Your inventory has been disabled!");
						}
					} else if (args.length == 1) {
						Player p2 = Bukkit.getPlayerExact(args[0]);
						if (p2.isOnline()) {
							User t = new User(p2);
							if (LH.isDisabled(t)) {
								LH.enableInventory(t);
								p.sendMessage(prefix + "You have enabled " + ChatColor.GOLD + t.getName() + ChatColor.YELLOW + "'s inventory!");
								t.sendMessage(prefix + "Your inventory has been enabled by " + ChatColor.GOLD + p.getName() + ChatColor.YELLOW + "!");
							} else {
								LH.disableInventory(t);
								p.sendMessage(prefix + "You have disabled " + ChatColor.GOLD + t.getName() + ChatColor.YELLOW + "'s inventory!");
								t.sendMessage(prefix + "Your inventory has been disabled by " + ChatColor.GOLD + p.getName() + ChatColor.YELLOW + "!");
							}
						} else {
							ErrorMessages.doErrorMessage(p, Messages.PLAYER_OFFLINE, args[0]);
						}
					} else {
						ErrorMessages.doErrorMessage(p, Messages.NOPERM, "/toggleinv");
					}
				} else {
					sender.sendMessage(ChatColor.RED + "You must be a player to perform this command!");
				}
			}
		}
		return false;
	}
}