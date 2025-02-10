package net.cr055.letsdoquestitems.sound;

import net.cr055.letsdoquestitems.LetsDoAddonQuestItems;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSounds {
    public static final SoundEvent HAMMER_HIT_SOUND = registerSoundEvent("hammer_hit");
    public static final SoundEvent HAMMER_LEAP_SOUND = registerSoundEvent("hammer_leap");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(LetsDoAddonQuestItems.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        LetsDoAddonQuestItems.LOGGER.info("Registering sounds for " + LetsDoAddonQuestItems.MOD_ID);
    }
}
