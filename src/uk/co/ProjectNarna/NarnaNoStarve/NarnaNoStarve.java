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
    along with NarnaNoStarve.  If not, see <http://www.gnu.org/licenses/>.
*/
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
