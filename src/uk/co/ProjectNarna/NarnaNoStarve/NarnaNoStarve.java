package uk.co.ProjectNarna.NarnaNoStarve;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class NarnaNoStarve extends JavaPlugin {
	
	public void onEnable(){
		PluginManager manager = this.getServer().getPluginManager();
		
		manager.registerEvents(new NarnaNoStarveHungerListener(), this);
	}
	
	public void onDisable(){
		
	}

}
