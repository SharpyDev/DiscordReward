package net.sharpydev.reward.util;

import org.bukkit.ChatColor;

public class ChatUtil {
    public static String fixColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
