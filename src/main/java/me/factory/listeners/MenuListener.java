package me.factory.listeners;

import me.factory.menuSystem.Menu;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class MenuListener implements Listener {


    @EventHandler
    public void onClick(InventoryClickEvent e) {
        InventoryHolder holder = e.getInventory().getHolder();

        if (holder instanceof Menu) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;
            }

            Menu menu = (Menu) holder;

            menu.handleMenu(e);
        }
    }
}
