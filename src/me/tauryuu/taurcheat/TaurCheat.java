package me.tauryuu.taurcheat;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;

public class TaurCheat extends JavaPlugin {
	
	public static FileConfiguration config;
	
	public void onEnable()
	{
		System.out.println("[TaurCheat] TaurCheat has been enabled.");
		Bukkit.getServer().getPluginManager().registerEvent(Type.PLAYER_JOIN, new TaurCheatListener(), Priority.Low, this);
		System.out.println("[TaurCheat] " +  this.getDescription().getVersion() + " loaded.");
		config = getConfig();
		configSetup();
		saveConfig();
	}
	
	public void onDisable()
	{
		System.out.println("[TaurCheat] TaurCheat has been disabled.");
	}
	
	public void configSetup()
	{
		if(config.getString("version.current-plugin-version-number") == null)
		{
			config.set("version.current-plugin-version-number", this.getDescription().getVersion());
		}
		if(config.getString("version.current-plugin-version-number") != this.getDescription().getVersion())
		{
			config.set("version.current-plugin-version-number", this.getDescription().getVersion());
		}
	}

}
