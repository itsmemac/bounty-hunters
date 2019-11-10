package net.Indyuce.bountyhunters.comp.friends;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import net.Indyuce.bountyhunters.api.event.BountyClaimEvent;
import net.simplyrin.bungeefriends.Main;

public class BungeeFriendsSupport implements Listener {
	private final Main plugin = (Main) Bukkit.getPluginManager().getPlugin("BungeeFriends");

	@EventHandler(priority = EventPriority.LOWEST)
	public void a(BountyClaimEvent event) {
		if (plugin.getFriendManager().getPlayer(event.getClaimer().getUniqueId()).isFriend(event.getBounty().getTarget().getUniqueId()))
			event.setCancelled(true);
	}
}
