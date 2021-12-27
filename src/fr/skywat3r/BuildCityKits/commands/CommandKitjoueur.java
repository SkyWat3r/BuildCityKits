package fr.skywat3r.BuildCityKits.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.skywat3r.BuildCityKits.Main;



public class CommandKitjoueur implements CommandExecutor {
	
	ArrayList<Player> pl = new ArrayList<Player>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	Player p = (Player) sender;	
    	
        	if(!(sender instanceof Player)) return false;
       

        	if(pl.contains(p)) {
        		p.sendMessage("§cTu as déjà recu le kit §a§lJoueur §r§c!");
        		p.sendMessage("§eAttends encore un peu :D");
        		return false;
        	} else {
        		ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
        		ItemMeta casqueM = casque.getItemMeta();
        		
        			casqueM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			casqueM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        			casque.setItemMeta(casqueM);
        			p.getInventory().addItem(casque);
        		
        		ItemStack plastron = new ItemStack(Material.IRON_CHESTPLATE, 1);
        		ItemMeta plastronM = plastron.getItemMeta();
        		
        			plastronM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			plastron.setItemMeta(plastronM);
        			p.getInventory().addItem(plastron);
        		
        		ItemStack pentalon = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        		ItemMeta pentalonM = pentalon.getItemMeta();
        		
        			pentalonM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			pentalonM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        			pentalon.setItemMeta(pentalonM);
        			p.getInventory().addItem(pentalon);
        		
        		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
        		ItemMeta bootsM = boots.getItemMeta();
        		
        			bootsM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			bootsM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        			boots.setItemMeta(bootsM);
        			p.getInventory().addItem(boots);
        			
        		ItemStack epee = new ItemStack(Material.STONE_SWORD, 1);
        		ItemMeta epeeM = epee.getItemMeta();
        			
        			epeeM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			epeeM.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        			epeeM.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 1, true);
        			epeeM.addEnchant(Enchantment.DAMAGE_UNDEAD, 1, true);
        			epeeM.setUnbreakable(true);
        			epee.setItemMeta(epeeM);
        			p.getInventory().addItem(epee);
        			
        		ItemStack pioche = new ItemStack(Material.STONE_PICKAXE, 1);
        		ItemMeta piocheM = pioche.getItemMeta();
        				
        			piocheM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			piocheM.addEnchant(Enchantment.DIG_SPEED, 1, true);
        			piocheM.addEnchant(Enchantment.DURABILITY, 1, true);
        			pioche.setItemMeta(piocheM);
        			p.getInventory().addItem(pioche);
        			
        		ItemStack axe = new ItemStack(Material.STONE_AXE, 1);
        		ItemMeta axeM = axe.getItemMeta();
        					
        			axeM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			axeM.addEnchant(Enchantment.DIG_SPEED, 1, true);
        			axeM.addEnchant(Enchantment.DURABILITY, 1, true);
        			axe.setItemMeta(axeM);
        			p.getInventory().addItem(axe);
        			
        		ItemStack pelle = new ItemStack(Material.STONE_SPADE, 1);
        		ItemMeta pelleM = pelle.getItemMeta();
        						
        			pelleM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			pelleM.addEnchant(Enchantment.DIG_SPEED, 1, true);
        			pelleM.addEnchant(Enchantment.DURABILITY, 1, true);
        			pelle.setItemMeta(pelleM);
        			p.getInventory().addItem(pelle);
        			
        		ItemStack arc = new ItemStack(Material.BOW, 1);
        		ItemMeta arcM = arc.getItemMeta();
        		
        			arcM.setDisplayName("§a§l[KIT] §r§aJoueur");
        			arc.setItemMeta(arcM);
        			p.getInventory().addItem(arc);
        			
        		ItemStack bois = new ItemStack(Material.LOG, 16);
        			
        			p.getInventory().addItem(bois);
        			
        		ItemStack fleche = new ItemStack(Material.ARROW, 16);
        		
        			p.getInventory().addItem(fleche);
        			
        		ItemStack steak = new ItemStack(Material.COOKED_BEEF, 8);
        			
        			p.getInventory().addItem(steak);
        			
        		ItemStack torche = new ItemStack(Material.TORCH, 32);
        		 
        		 	p.getInventory().addItem(torche);
        		 	
        		
        		p.updateInventory();
        		p.sendMessage("§aVous avez reçu le kit §lJoueur");
        		
        		
        	}	
        		pl.add(p);
        		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
        			@Override
        			public void run() {
                    pl.remove(p);
                }
            }, 1728000);
        
        		return false;
        }
    
    }
