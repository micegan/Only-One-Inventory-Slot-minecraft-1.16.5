package plugin;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.Dispenser;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPistonEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Lever;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

	@Override
	   public void onEnable() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(this, this);
	}
	
	
	@Override
	public void onDisable() {
		
	}
	

     
	/*
	@EventHandler
    public void OnInventoryOpen(org.bukkit.event.inventory. e) {
		
			
		 
		
		
e.getPlayer().sendMessage("fuckdddddddd");

AnvilInventory inv = (AnvilInventory) Bukkit.createInventory(e.getPlayer(), InventoryType.ANVIL, "Anvil");

e.getPlayer().openInventory(inv);

inv.setItem(0, new ItemStack(Material.PAPER, -999));
				 
			
		
		
	}*/
	
	@EventHandler
	public void llpeaax(PlayerJoinEvent event) {

		//event.getPlayer().getInventory().clear();
		for (int c =1; c< event.getPlayer().getInventory().getSize()-5; c++) {
			
		event.getPlayer().getInventory().setItem(c,new ItemStack(Material.BARRIER, 1));
		
		
		}
		
	}

	@EventHandler
	public void ded(org.bukkit.event.player.PlayerRespawnEvent event) {

		event.getPlayer().getInventory().clear();
		for (int c =1; c< event.getPlayer().getInventory().getSize()-5; c++) {
			
		event.getPlayer().getInventory().setItem(c,new ItemStack(Material.BARRIER, 1));
		
		
		}
		
	}
	
	@EventHandler
	public void ded1(org.bukkit.event.inventory.InventoryCloseEvent event) {

		//event.getPlayer().getInventory().clear();
		for (int c =1; c< event.getPlayer().getInventory().getSize()-5; c++) {
			
		event.getPlayer().getInventory().setItem(c,new ItemStack(Material.BARRIER, 1));
		
		
		}
		
	}
	
	@EventHandler
	public void ded12(org.bukkit.event.player.PlayerDropItemEvent event) {
		if (event.getItemDrop().getItemStack().getType() == Material.BARRIER) {
event.setCancelled(true);
		//event.getPlayer().getInventory().clear();
		for (int c =1; c< event.getPlayer().getInventory().getSize()-5; c++) {
			
		event.getPlayer().getInventory().setItem(c,new ItemStack(Material.BARRIER, 1));
		}
		
		}
		
	}
	
	@EventHandler
	public void ded12(org.bukkit.event.block.BlockPlaceEvent event) {
		if (event.getItemInHand().getType() == Material.BARRIER) {
event.setCancelled(true);
		//event.getPlayer().getInventory().clear();
		for (int c =1; c< event.getPlayer().getInventory().getSize()-5; c++) {
			
		event.getPlayer().getInventory().setItem(c,new ItemStack(Material.BARRIER, 1));
		}
		
		}
		
	}
	
	@EventHandler
	public void ded2(org.bukkit.event.inventory.InventoryClickEvent event) {

		if (event.getSlot() >1 && event.getSlot() <event.getWhoClicked().getInventory().getSize()-5) {
			event.setCancelled(true);
		}
		
	}
	



}
		
		
		

	
	
		
	
		
		
	/*	for (int i = 0; i < nnn.size(); i++) {
			if (nnn.get(i).getClass() == ShulkerBox.class) {
				
				ArrayList<ItemStack> is = new ArrayList<ItemStack>();
				
				
				ShulkerBox sb = (ShulkerBox) nnn.get(i);
				
				
				
					if (sb.getInventory().getContents().length == 27) {
						
					}
				
			}
		}*/
	
	
	

