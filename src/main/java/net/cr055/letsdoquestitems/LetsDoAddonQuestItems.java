package net.cr055.letsdoquestitems;

import net.cr055.letsdoquestitems.item.ModItemGroups;
import net.cr055.letsdoquestitems.item.ModItems;
import net.cr055.letsdoquestitems.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetsDoAddonQuestItems implements ModInitializer {
	public static final String MOD_ID = "lets-do-quest-items";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}