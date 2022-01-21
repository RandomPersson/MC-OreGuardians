package pl.org.mensa.rp.mc.OreGuardians;

import org.bukkit.plugin.java.JavaPlugin;

public class OreGuardiansPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
	}
}
