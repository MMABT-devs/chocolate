package massblabla.mod.chocolate;

import massblabla.mod.chocolate.registry.ModBlocks;
import massblabla.mod.chocolate.registry.ModFlammableBlocks;
import massblabla.mod.chocolate.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChocolateMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("chocolate");

	@Override
	public void onInitialize() {
		LOGGER.info("Chocolate Mod!");

		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModFlammableBlocks.registerFlammableBlocks();
	}

}
