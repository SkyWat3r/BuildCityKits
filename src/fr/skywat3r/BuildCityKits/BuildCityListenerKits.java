package fr.skywat3r.BuildCityKits;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class BuildCityListenerKits implements Listener {

	@EventHandler
	public void onInteract(InventoryClickEvent e) {
		
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack current = e.getCurrentItem();
		int slot = e.getSlot();
		
		if(inv.getName().equalsIgnoreCase("񙓥Kits :")) {
			
			if(current.getType() == Material.SKULL_ITEM) {
				
				switch(slot) {
				
					case 11:
						p.performCommand("kit-joueur");
						p.closeInventory();
						
				}
				
				switch(slot) {
				
					case 25:
						p.performCommand("kit-vip");
						p.closeInventory();
						
						if(p.hasPermission("kit-vip.use")) {
						p.sendMessage("Vous avez re鐄 le kit VIP");
					}	
				}
				
				switch(slot) {
				
				case 29:
					p.performCommand("kit-vip+");
					p.closeInventory();
					p.sendMessage("Vous avez re鐄 le kit VIP+");
					
				}
				
				switch(slot) {
					
				case 31:
					p.performCommand("kit-vip++");
					p.closeInventory();
					p.sendMessage("Vous avez re鐄 le kit VIP++");
					
				}
				
				switch(slot) {
				
				case 33:
					p.performCommand("kit-ultime");
					p.closeInventory();
					p.sendMessage("Vous avez re鐄 le kit Ultime");
					
				}
				
		}
		
			
			if(current.getType() == Material.BARRIER) {
				
				p.closeInventory();
				
			}
		}
	}
}





