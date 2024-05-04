package me.factory.menuSystem;

import org.bukkit.entity.Player;

public class PlayerMenuUtility {



    private Player owner;

    public PlayerMenuUtility(Player player) {
        this.owner = player;
    }
    public Player getOwner() {
        return owner;
    }
}
