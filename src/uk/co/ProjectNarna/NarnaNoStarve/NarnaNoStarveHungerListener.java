package uk.co.ProjectNarna.NarnaNoStarve;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class NarnaNoStarveHungerListener implements Listener {
	
	@EventHandler ( priority = EventPriority.HIGH )
	public void onFoodLevelChangeEvent( FoodLevelChangeEvent event){
		Entity entity = event.getEntity();
		if ( entity instanceof Player ){
			Player player = (Player)entity;
			
			if ( player.hasPermission("NarnaNoStarve.NoStarve") ){
				event.setFoodLevel(20);
			}
		}
	}
	
	@EventHandler ( priority = EventPriority.HIGH )
	public void onEntityDamage(EntityDamageEvent event){
		Entity entity = event.getEntity();
		if ( entity instanceof Player){
			Player player = (Player)entity;
			
			if ( player.hasPermission("NarnaNoStarve.NoDamage") || player.hasPermission("NarnaNoStarve.NoStarve") ){
				if ( event.getCause().equals(DamageCause.STARVATION) ){
					event.setCancelled(true);
				}
			}
			
		}
	}

}
