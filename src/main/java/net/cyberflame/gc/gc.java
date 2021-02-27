package net.cyberflame.gc;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class gc extends JavaPlugin {
	
	public void onEnable(){
		saveDefaultConfig();
		new BukkitRunnable(){
			@Override
			public void run() {
				if (getConfig().getBoolean("debug")){
					System.out.println("[GC] Running scheduled garbage collection task...");
				}
				System.gc();
			}
		}.runTaskTimerAsynchronously(this, 0, getConfig().getLong("frequency") * 20 * 60);
	}
}
