package pl.org.mensa.rp.mc.OreGuardians;

import java.util.Random;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
	Random random;
	
	public BlockBreakListener() {
		this.random = new Random(System.currentTimeMillis());
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		if (e.getPlayer().getGameMode() != GameMode.CREATIVE && e.getBlock().getType() == Material.REDSTONE_ORE) {
			if (random.nextDouble() < 0.6D) e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation().add(0.5D, 0.0D, 0.5D), EntityType.SILVERFISH);
		}
	}
}
