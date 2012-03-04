/*    This file is part of NarnaNoStarve.

    NarnaNoStarve is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    NarnaNoStarve is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
*/

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
