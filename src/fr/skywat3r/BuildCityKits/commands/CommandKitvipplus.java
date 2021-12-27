package fr.skywat3r.BuildCityKits.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CommandKitvipplus implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		
		
		Player p = (Player) sender;
		ItemStack casque = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta casqueM = casque.getItemMeta();
		
			casqueM.setDisplayName("§a§l[KIT] §r§aVIP+");
			casqueM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			casqueM.addEnchant(Enchantment.DURABILITY, 2, true);
			casque.setItemMeta(casqueM);
			p.getInventory().addItem(casque);
		
		ItemStack plastron = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta plastronM = plastron.getItemMeta();
		
			plastronM.setDisplayName("§a§l[KIT] §r§aVIP+");
			plastronM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			plastronM.addEnchant(Enchantment.DURABILITY, 1, true);
			plastron.setItemMeta(plastronM);
			p.getInventory().addItem(plastron);
		
		ItemStack pentalon = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta pentalonM = pentalon.getItemMeta();
		
			pentalonM.setDisplayName("§a§l[KIT] §r§aVIP+");
			pentalonM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			pentalonM.addEnchant(Enchantment.DURABILITY, 2, true);
			pentalon.setItemMeta(pentalonM);
			p.getInventory().addItem(pentalon);
		
		ItemStack boots = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta bootsM = boots.getItemMeta();
		
			bootsM.setDisplayName("§a§l[KIT] §r§aVIP+");
			bootsM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			bootsM.addEnchant(Enchantment.DURABILITY, 2, true);
			boots.setItemMeta(bootsM);
			p.getInventory().addItem(boots);
			
		ItemStack epee = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta epeeM = epee.getItemMeta();
				
			epeeM.setDisplayName("§a§l[KIT] §r§aVIP+");
			epeeM.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
			epeeM.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 3, true);
			epeeM.addEnchant(Enchantment.DAMAGE_UNDEAD, 3, true);
			epeeM.setUnbreakable(true);
			epee.setItemMeta(epeeM);
			p.getInventory().addItem(epee);
			
		ItemStack pioche = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta piocheM = pioche.getItemMeta();
					
			piocheM.setDisplayName("§a§l[KIT] §r§aVIP+");
			piocheM.addEnchant(Enchantment.DIG_SPEED, 2, true);
			piocheM.addEnchant(Enchantment.DURABILITY, 3, true);
			piocheM.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
			pioche.setItemMeta(piocheM);
			p.getInventory().addItem(pioche);
				
		ItemStack axe = new ItemStack(Material.IRON_AXE, 1);
		ItemMeta axeM = axe.getItemMeta();
						
			axeM.setDisplayName("§a§l[KIT] §r§aVIP+");
		    axeM.addEnchant(Enchantment.DIG_SPEED, 3, true);
			axeM.addEnchant(Enchantment.DURABILITY, 3, true);
			axeM.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
			axe.setItemMeta(axeM);
			p.getInventory().addItem(axe);
				
		ItemStack pelle = new ItemStack(Material.IRON_SPADE, 1);
		ItemMeta pelleM = pelle.getItemMeta();
							
			pelleM.setDisplayName("§a§l[KIT] §r§aVIP+");
			pelleM.addEnchant(Enchantment.DIG_SPEED, 3, true);
			pelleM.addEnchant(Enchantment.DURABILITY, 3, true);
			pelleM.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
			pelle.setItemMeta(pelleM);
			p.getInventory().addItem(pelle);
			
		ItemStack arc = new ItemStack(Material.BOW, 1);
		ItemMeta arcM = arc.getItemMeta();
				
			arcM.setDisplayName("§a§l[KIT] §r§aVIP+");
			arcM.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
			arcM.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
			arcM.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
			arcM.addEnchant(Enchantment.DURABILITY, 1, true);
			arc.setItemMeta(arcM);
			p.getInventory().addItem(arc);
					
		ItemStack fleche = new ItemStack(Material.ARROW, 1);
					
			p.getInventory().addItem(fleche);
			
		ItemStack sceau = new ItemStack(Material.WATER_BUCKET, 2);
			
			p.getInventory().addItem(sceau);
			
		ItemStack bois = new ItemStack(Material.LOG, 48);
		
			p.getInventory().addItem(bois);
			
		ItemStack book = new ItemStack(Material.BOOK, 10);
			
			p.getInventory().addItem(book);
			
		ItemStack steak = new ItemStack(Material.COOKED_BEEF, 32);
			
			p.getInventory().addItem(steak);
			
		ItemStack torche = new ItemStack(Material.TORCH, 1);
		ItemMeta torcheM = torche.getItemMeta();
		List<String> loresList = new ArrayList<String>();
		
			loresList.add("§7Donne un effect de §lNight Vision");
			loresList.add("§7Quand celle-ci est porté dans la deuxième main");
			torcheM.setDisplayName("§r§1Night torch");
			torcheM.setLore(loresList);
			torche.setItemMeta(torcheM);
			
		 	p.getInventory().addItem(torche);
		
		return false;
		
	}
}
