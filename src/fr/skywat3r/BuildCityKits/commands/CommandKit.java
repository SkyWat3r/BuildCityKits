package fr.skywat3r.BuildCityKits.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import utils.ItemBuilder;

public class CommandKit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		
		Player p = (Player) sender;
		Inventory kit = Bukkit.createInventory(null, 45, "񙓥Kits :");
		
		
		
		kit.setItem(19, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Youtubeur").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTVmODkyNGYzMTZhMDBhOWI4MDYxMjQ5YzA4NTEzYjBjYzM3ZGQ2ZmEzMTBkMDVlMzhmM2Q5YzZiODJjZjBkYiJ9fX0=", "ytb").toItemStack());
		kit.setItem(15, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Mini Youtubeur").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmMwNzFlMTE5N2JjZWI0ODE5ZDU2ZGRjYmYwYTY4NDE1ODE3MDhlODAzOWZiYWZkZTAzMGNiMzY1NjdjNmVlOSJ9fX0=", "miniytb").toItemStack());
		kit.setItem(23, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Streameur").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDZiZTY1ZjQ0Y2QyMTAxNGM4Y2RkZDAxNThiZjc1MjI3YWRjYjFmZDE3OWY0YzFhY2QxNThjODg4NzFhMTNmIn19fQ==", "streamer").toItemStack());
		kit.setItem(21, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Mini Streameur").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmYxOGZhNDNkNGQ5Mzc4OTQ4YjU2Yjg1YjUzMTk3OTA3NDExOWMxMjUyMzJlNzE1Y2U0YmQ1Mjc4MGFjNGQ3NiJ9fX0=", "ministreameur").toItemStack());
		kit.setItem(25, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit VIP").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmZjNWUyODZkOWMxZDE5ZDZkNjA1OWQ2OWIzMzEzOWYxOGNlNjlmYWVmZjBmZWU4OTRkMDRlOTNlN2NiOTg2NyJ9fX0=", "vip").toItemStack());
		kit.setItem(29, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit VIP+").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdmNTdlN2FhOGRlODY1OTFiYjBiYzUyY2JhMzBhNDlkOTMxYmZhYmJkNDdiYmM4MGJkZDY2MjI1MTM5MjE2MSJ9fX0=", "vip+").toItemStack());
		kit.setItem(31, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit VIP++").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTYzMTU5N2RjZTRlNDA1MWU4ZDVhNTQzNjQxOTY2YWI1NGZiZjI1YTBlZDYwNDdmMTFlNjE0MGQ4OGJmNDhmIn19fQ==", "vip++").toItemStack());
		kit.setItem(13, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Nourriture").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2VjYjZkM2JhZjkwYWQ5MDQ2OThjMTVkNGFiOWI3YzA4NTNkOTA5MWUyZjUxY2Y5OGNkODdiYTM4ZWQ1ODIwNSJ9fX0=", "nourriture").toItemStack());
		kit.setItem(11, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Joueur").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDEyNjk1ODRmNjI5MjI3NzEzMTA3YjRlMGEwMmRkNjVkZGZlNzgwZTdjNzExOGNiMWVjMjI3NWM1MTRjYzk1ZCJ9fX0=", "joueur").toItemStack());
		kit.setItem(33, new ItemBuilder(Material.SKULL_ITEM, 1, (short) 3).setName("Kit Ultime").setLore("","").setSkullImage("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmVjODAzMTM0MDRhYWE2MGNiYWMxMDk4ZTNlMDVmMTA3YjlmNjY1MzQxMDNlOWI1OTRlOTIzMGVhMjI2YjVjZSJ9fX0=", "ultime").toItemStack());
		kit.setItem(44, new ItemBuilder(Material.BARRIER, 1, (short) 3).setName("�4QUIT").setLore("","").toItemStack());
		
		fillEmptySlot(kit, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7));
		
		p.openInventory(kit);
		
		
		return false;
	}

	private void fillEmptySlot(Inventory inv, ItemStack item) {
        for(int i =0; i < inv.getSize(); i++) {
            if(inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
                inv.setItem(i, item);
            }
        }
    }
	
}
