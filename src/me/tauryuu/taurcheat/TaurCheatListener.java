package me.tauryuu.taurcheat;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class TaurCheatListener extends PlayerListener {
	
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		
	String FLY_DISABLER = "&f &f &1 &0 &2 &4 &3 &9 &2 &0 &0 &1 ";
	String CHEAT_DISABLER = "&f &f &2 &0 &4 &8 &3 &9 &2 &0 &0 &2 &3 &9 &2 &0 &0 &3 ";
	
	String FLY_MSG = FLY_DISABLER.replaceAll("(&([a-f0-9]))", "\u00A7$2");
	String CHEAT_MSG = CHEAT_DISABLER.replaceAll("(&([a-f0-9]))", "\u00A7$2");
	
		Player player = event.getPlayer();
		
		if(!player.hasPermission("taurcheat.fly"))
		{
			player.sendMessage(FLY_MSG);
		}
		
		if(!player.hasPermission("taurcheat.cheat"))
		{
			player.sendMessage(CHEAT_MSG);
		}
		
		return;
		
	}
}
