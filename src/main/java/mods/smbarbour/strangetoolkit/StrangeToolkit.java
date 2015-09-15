package mods.smbarbour.strangetoolkit;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkCheckHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Map;

@Mod(modid = "strangetoolkit", name="StrangeToolkit", version = "1.1")
public class StrangeToolkit
{
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		EntityRegistry.removeSpawn("Butterfly", EnumCreatureType.ambient, BiomeGenBase.getBiomeGenArray());
		EntityRegistry.removeSpawn("Cricket", EnumCreatureType.ambient, BiomeGenBase.getBiomeGenArray());
		EntityRegistry.removeSpawn("Moth", EnumCreatureType.ambient, BiomeGenBase.getBiomeGenArray());
	}

	@NetworkCheckHandler
	public boolean isAcceptable(Map<String,String> modList, Side side) {
		return true;
	}
}
