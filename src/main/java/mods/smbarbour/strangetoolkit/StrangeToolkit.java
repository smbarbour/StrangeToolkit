package mods.smbarbour.strangetoolkit;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkCheckHandler;
import cpw.mods.fml.relauncher.Side;
import mods.smbarbour.strangetoolkit.commands.OMTChangeOwnerCommand;

import java.util.Map;

@Mod(modid = "strangetoolkit", name="StrangeToolkit", version = "1.0")
public class StrangeToolkit
{
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		if (Loader.isModLoaded("openmodularturrets")) {
			e.registerServerCommand(new OMTChangeOwnerCommand());
		}
	}

	@NetworkCheckHandler
	public boolean isAcceptable(Map<String,String> modList, Side side) {
		return true;
	}
}
