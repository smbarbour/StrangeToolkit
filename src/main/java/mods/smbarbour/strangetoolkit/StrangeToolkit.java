package mods.smbarbour.strangetoolkit;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import mods.smbarbour.strangetoolkit.commands.OMTChangeOwnerCommand;

@Mod(modid = "strangetoolkit", name="StrangeToolkit", version = "1.0")
public class StrangeToolkit
{
	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent e) {
		if (Loader.isModLoaded("openmodularturrets")) {
			e.registerServerCommand(new OMTChangeOwnerCommand());
		}
	}
}
