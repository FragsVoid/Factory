package me.factory.utils;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static int getServerVersion() {
        String version = Bukkit.getServer().getBukkitVersion();
        if (version.contains("-")) {
            return Integer.parseInt(version.substring(0, version.indexOf('-')).replaceAll("\\.", ""));
        }

        return Integer.parseInt(version);
    }

    //#637123
    private static final Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");

    public static String hexTranslator(String message) {
        if (getServerVersion() >= 1.16)  {
            Matcher matcher = pattern.matcher(message);
            while (matcher.find()) {
                String color = message.substring(matcher.start(), matcher.end());
                message = message.replace(color, ChatColor.of(color) + "");
                matcher = pattern.matcher(message);
            }
        }
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
