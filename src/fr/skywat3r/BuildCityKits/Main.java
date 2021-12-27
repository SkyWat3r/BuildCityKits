package fr.skywat3r.BuildCityKits;


import org.bukkit.plugin.java.JavaPlugin;

import fr.skywat3r.BuildCityKits.commands.CommandKit;
import fr.skywat3r.BuildCityKits.commands.CommandKitjoueur;
import fr.skywat3r.BuildCityKits.commands.CommandKitultime;
import fr.skywat3r.BuildCityKits.commands.CommandKitvip;
import fr.skywat3r.BuildCityKits.commands.CommandKitvipplus;
import fr.skywat3r.BuildCityKits.commands.CommandKitvipplusplus;


public class Main extends JavaPlugin {
	
	private static Main instance;
	
	@Override
	public void onEnable() {
		System.out.println("===========================");
		System.out.println("Plugin vien de s'allumer !");
		System.out.println("===========================");
		instance = this;
		
		getServer().getPluginManager().registerEvents(new BuildCityListenerKits(), this);
		
		getCommand("kits").setExecutor(new CommandKit());
		getCommand("kit-joueur").setExecutor(new CommandKitjoueur());
		//getCommand("kit-youtubeur").setExecutor(new CommandKityoutubeur());
		//getCommand("kit-miniyoutubeur").setExecutor(new CommandKitminiyoutubeur());
		//getCommand("kit-streamer").setExecutor(new CommandKitstreamer());
		//getCommand("kit-ministreamer").setExecutor(new CommandKitministreameur());
		getCommand("kit-vip").setExecutor(new CommandKitvip());
		getCommand("kit-vip+").setExecutor(new CommandKitvipplus());
		getCommand("kit-vip++").setExecutor(new CommandKitvipplusplus());
		getCommand("kit-ultime").setExecutor(new CommandKitultime());
		//getCommand("kit-nourriture").setExecutor(new CommandKitbouffe());
	
		
	
	}
	
	@Override
	public void onDisable() {
		System.out.println("============================");
		System.out.println("Plugin vien de s'eteindre !");
		System.out.println("============================");
	
	}
		
	public static Main getInstance() {
	    return instance;
	}
	
	}


