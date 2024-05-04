package me.factory.menuSystem.menu;

import me.factory.menuSystem.Menu;
import me.factory.menuSystem.PlayerMenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CoreMenu extends Menu {
    public CoreMenu(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
    }

    @Override
    public String getMenuName() {
        return null;
    }

    @Override
    public int getSlots() {
        return 0;
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }

    @Override
    public void setMenuItems() {

    }
}
