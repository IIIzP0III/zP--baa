package coffee.solarsystem.utilz;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class C {
    public C() {
    }

    public static String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static List<String> colorLines(List<String> lore) {
        List<String> color = new ArrayList<>();

        for (String s : lore) {
            color.add(color(s));
        }

        return color;
    }
}
