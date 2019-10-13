package net.Indyuce.bountyhunters.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class HunterLevelUpEvent extends Event {
	private final Player player;
	private final int newLevel;

	private static final HandlerList handlers = new HandlerList();

	/*
	 * this event is called when a player levels up (cannot be cancelled)
	 */
	public HunterLevelUpEvent(Player player, int newLevel) {
		this.player = player;
		this.newLevel = newLevel;
	}

	public Player getPlayer() {
		return player;
	}

	public int getNewLevel() {
		return newLevel;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}