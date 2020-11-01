package cf.urgpa.nocreeper;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class NoCreeper extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onExplode(EntityExplodeEvent event) {
		if(event.getEntityType() == EntityType.CREEPER){
			event.setCancelled(true);
		}
	}
}
