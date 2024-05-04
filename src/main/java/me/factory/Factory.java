package me.factory;

import me.factory.files.MessageManager;
import me.factory.listeners.MenuListener;
import me.factory.menuSystem.PlayerMenuUtility;
import me.factory.utils.ConfigUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

import static me.factory.utils.Utils.getServerVersion;

public final class Factory extends JavaPlugin{

    private static final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public MessageManager message;

    public ConfigUtils configUtils;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.message = new MessageManager(this);

        this.configUtils = new ConfigUtils(this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static PlayerMenuUtility getPlayerMenuUtilityMap(Player player) {
        PlayerMenuUtility playerMenuUtility;
        if (!(playerMenuUtilityMap.containsKey(player))) {
            playerMenuUtility = new PlayerMenuUtility(player);
            playerMenuUtilityMap.put(player, playerMenuUtility);

            return playerMenuUtility;
        } else {
            return playerMenuUtilityMap.get(player);
        }
    }


    public void registerEvents() {
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }
}
