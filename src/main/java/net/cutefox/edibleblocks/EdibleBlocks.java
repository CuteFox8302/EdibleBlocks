package net.cutefox.edibleblocks;

import net.cutefox.edibleblocks.item.ModItemGroups;
import net.cutefox.edibleblocks.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdibleBlocks implements ModInitializer {
	public static final String MOD_ID = "edibleblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}