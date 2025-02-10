package net.cr055.letsdoquestitems.item;

import net.cr055.letsdoquestitems.LetsDoAddonQuestItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup QUEST_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LetsDoAddonQuestItems.MOD_ID, "ancient_banner"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ancient_banner"))
                    .icon(() -> new ItemStack(ModItems.GOLDEN_KEY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ANCIENT_BANNER);
                        entries.add(ModItems.ANCIENT_COIN);
                        entries.add(ModItems.ANCIENT_RUNE);
                        entries.add(ModItems.ANCIENT_TABLET);
                        entries.add(ModItems.ANIMAL_PELTS);
                        entries.add(ModItems.BAT_WINGS);
                        entries.add(ModItems.BENT_FORK);
                        entries.add(ModItems.BLOODIED_CLOTH);
                        entries.add(ModItems.BLUNT_KNIFE);
                        entries.add(ModItems.BONE_DICE);
                        entries.add(ModItems.BROKEN_CHAINS);
                        entries.add(ModItems.BROKEN_OAR);
                        entries.add(ModItems.BROKEN_SHIELD);
                        entries.add(ModItems.BUNDLE_OF_ARROWS);
                        entries.add(ModItems.BURNT_BOOK);
                        entries.add(ModItems.CALENDAR);
                        entries.add(ModItems.CHIPPED_DAGGER);
                        entries.add(ModItems.COMMENDATION_MARK);
                        entries.add(ModItems.CRACKED_BELL);
                        entries.add(ModItems.CRACKED_GEMSTONE);
                        entries.add(ModItems.CRACKED_HOURGLASS);
                        entries.add(ModItems.CRACKED_MIRROR);
                        entries.add(ModItems.CRACKED_MOSAIC);
                        entries.add(ModItems.CROOKED_SPEAR);
                        entries.add(ModItems.CRUDE_DRAWING);
                        entries.add(ModItems.CURSED_AMULET);
                        entries.add(ModItems.CURSED_RING);
                        entries.add(ModItems.CURSED_TOME);
                        entries.add(ModItems.DARK_GEMSTONE);
                        entries.add(ModItems.DARK_ORB);
                        entries.add(ModItems.DECAYING_SKULL);
                        entries.add(ModItems.DECREPIT_CROWN);
                        entries.add(ModItems.DEMON_HORN);
                        entries.add(ModItems.DEMONIC_LEATHER);
                        entries.add(ModItems.DENTED_HELMET);
                        entries.add(ModItems.DRIED_HERBS);
                        entries.add(ModItems.DULL_AXE);
                        entries.add(ModItems.DUSTY_GOBLET);
                        entries.add(ModItems.DUSTY_TOME);
                        entries.add(ModItems.EMPTY_COFFER);
                        entries.add(ModItems.EMPTY_FLASK);
                        entries.add(ModItems.ENGRAVED_LOCKET);
                        entries.add(ModItems.FORGOTTEN_IDOL);
                        entries.add(ModItems.FOSSILIZED_EGG);
                        entries.add(ModItems.FOSSILIZED_TOOTH);
                        entries.add(ModItems.FRAYED_ROPE);
                        entries.add(ModItems.GOLDEN_KEY);
                        entries.add(ModItems.GOLDEN_NECKLACE);
                        entries.add(ModItems.HEALING_HERB);

                        entries.add(ModItems.HEARTHSTEAD_BRIGADE_WARHAMMER);

                        entries.add(ModItems.IRON_CUFFS);
                        entries.add(ModItems.IRON_KEY);
                        entries.add(ModItems.IRON_SPIKE);
                        entries.add(ModItems.JEWELED_CHALICE);
                        entries.add(ModItems.JEWELED_CROWN);
                        entries.add(ModItems.MOLDY_CHEESE);
                        entries.add(ModItems.MOSS);
                        entries.add(ModItems.MOSS_COVERED_IDOL);
                        entries.add(ModItems.MOLDY_BREAD);
                        entries.add(ModItems.MUMMIFIED_HAND);
                        entries.add(ModItems.MYSTERIOUS_POTION);
                        entries.add(ModItems.OLD_COINS);
                        entries.add(ModItems.OLD_STEEL_BASIN);
                        entries.add(ModItems.PETRIFIED_WOOD);
                        entries.add(ModItems.QUIVER_OF_ARROWS);
                        entries.add(ModItems.REDCAP_MUSHROOM);
                        entries.add(ModItems.ROTTEN_CHEST);
                        entries.add(ModItems.RUSTED_KEY);
                        entries.add(ModItems.RUSTY_HAMMER);
                        entries.add(ModItems.RUSTY_SCREW);
                        entries.add(ModItems.RUSTY_SHURIKEN);
                        entries.add(ModItems.RUSTY_SWORD);
                        entries.add(ModItems.SCATTERED_BONES);
                        entries.add(ModItems.SCORCHED_SCROLL);
                        entries.add(ModItems.SEVERED_CLAW);
                        entries.add(ModItems.SHADOWY_CLOAK);
                        entries.add(ModItems.SHATTERED_ARMOR);
                        entries.add(ModItems.SHATTERED_GEM);
                        entries.add(ModItems.SHATTERED_VASE);
                        entries.add(ModItems.SHREDDED_SCROLL);
                        entries.add(ModItems.SILK);
                        entries.add(ModItems.SKELETON_KEY);
                        entries.add(ModItems.SNAKE_FANG);
                        entries.add(ModItems.SOOTY_CANDLESTICK);
                        entries.add(ModItems.SPIDER_WEB);
                        entries.add(ModItems.SPLINTERED_STAFF);
                        entries.add(ModItems.STALE_WATER);
                        entries.add(ModItems.SUPPLY_BOX);
                        entries.add(ModItems.TATTERED_MAP);
                        entries.add(ModItems.TORN_BANNER);
                        entries.add(ModItems.TORN_SCROLL);
                        entries.add(ModItems.UNHOLY_SYMBOL);
                        entries.add(ModItems.UNLIT_CANDLE);
                        entries.add(ModItems.UNLIT_TORCH);
                        entries.add(ModItems.USED_BANDAGES);
                        entries.add(ModItems.WARPED_BOW);
                        entries.add(ModItems.WORN_BOOTS);
                        entries.add(ModItems.WORN_LOCKET);

                    }).build());

    public static void registerItemGroups() {
        LetsDoAddonQuestItems.LOGGER.info("Registering Item Groups for " + LetsDoAddonQuestItems.MOD_ID);
    }
}
