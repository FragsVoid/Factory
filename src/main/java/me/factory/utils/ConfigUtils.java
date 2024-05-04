package me.factory.utils;

import me.factory.Factory;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static me.factory.utils.Utils.getServerVersion;
import static me.factory.utils.Utils.hexTranslator;

public class ConfigUtils {

    //THIS CLASS GETS ALL THE VALUES FROM THE CONFIGS FILES

    private final Factory plugin;



    public ConfigUtils(Factory plugin) {
        this.plugin = plugin;
    }

    public String getConfigString(String path) {
        FileConfiguration messages = plugin.message.getConfig();
        String prefix = hexTranslator(messages.getString("prefix"));
        String string = messages.getString(path).replace("{prefix}", prefix);
        return hexTranslator(string);
    }
}
