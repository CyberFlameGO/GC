package net.cyberflame.gc;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class gc extends JavaPlugin {
  public void onEnable() {
    saveDefaultConfig();
    (new BukkitRunnable()
      {
        public void run() {
          if (gc.this.getConfig().getBoolean("debug")) {
            System.out.println("[GC] Running scheduled garbage collection task...");
          }
          System.gc();
        }
      }).runTaskTimerAsynchronously((Plugin)this, 0L, getConfig().getLong("frequency") * 20L * 60L);
  }
}
