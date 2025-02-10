package net.cr055.letsdoquestitems.item;

import net.cr055.letsdoquestitems.LetsDoAddonQuestItems;
import net.cr055.letsdoquestitems.item.custom.HammerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ANCIENT_BANNER = registerItem("ancient_banner", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_COIN = registerItem("ancient_coin", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_RUNE = registerItem("ancient_rune", new Item(new FabricItemSettings()));
    public static final Item ANCIENT_TABLET = registerItem("ancient_tablet", new Item(new FabricItemSettings()));
    public static final Item ANIMAL_PELTS = registerItem("animal_pelts", new Item(new FabricItemSettings()));
    public static final Item BAT_WINGS = registerItem("bat_wings", new Item(new FabricItemSettings()));
    public static final Item BENT_FORK = registerItem("bent_fork", new Item(new FabricItemSettings()));
    public static final Item BLOODIED_CLOTH = registerItem("bloodied_cloth", new Item(new FabricItemSettings()));
    public static final Item BLUNT_KNIFE = registerItem("blunt_knife", new Item(new FabricItemSettings()));
    public static final Item BONE_DICE = registerItem("bone_dice", new Item(new FabricItemSettings()));
    public static final Item BROKEN_CHAINS = registerItem("broken_chains", new Item(new FabricItemSettings()));
    public static final Item BROKEN_OAR = registerItem("broken_oar", new Item(new FabricItemSettings()));
    public static final Item BROKEN_SHIELD = registerItem("broken_shield", new Item(new FabricItemSettings()));
    public static final Item BUNDLE_OF_ARROWS = registerItem("bundle_of_arrows", new Item(new FabricItemSettings()));
    public static final Item BURNT_BOOK = registerItem("burnt_book", new Item(new FabricItemSettings()));
    public static final Item CALENDAR = registerItem("calendar", new Item(new FabricItemSettings()));
    public static final Item CHIPPED_DAGGER = registerItem("chipped_dagger", new Item(new FabricItemSettings()));
    public static final Item COMMENDATION_MARK = registerItem("commendation_mark", new Item(new FabricItemSettings()));
    public static final Item CRACKED_BELL = registerItem("cracked_bell", new Item(new FabricItemSettings()));
    public static final Item CRACKED_GEMSTONE = registerItem("cracked_gemstone", new Item(new FabricItemSettings()));
    public static final Item CRACKED_HOURGLASS = registerItem("cracked_hourglass", new Item(new FabricItemSettings()));
    public static final Item CRACKED_MIRROR = registerItem("cracked_mirror", new Item(new FabricItemSettings()));
    public static final Item CRACKED_MOSAIC = registerItem("cracked_mosaic", new Item(new FabricItemSettings()));
    public static final Item CROOKED_SPEAR = registerItem("crooked_spear", new Item(new FabricItemSettings()));
    public static final Item CRUDE_DRAWING = registerItem("crude_drawing", new Item(new FabricItemSettings()));
    public static final Item CURSED_AMULET = registerItem("cursed_amulet", new Item(new FabricItemSettings()));
    public static final Item CURSED_RING = registerItem("cursed_ring", new Item(new FabricItemSettings()));
    public static final Item CURSED_TOME = registerItem("cursed_tome", new Item(new FabricItemSettings()));
    public static final Item DARK_GEMSTONE = registerItem("dark_gemstone", new Item(new FabricItemSettings()));
    public static final Item DARK_ORB = registerItem("dark_orb", new Item(new FabricItemSettings()));
    public static final Item DECAYING_SKULL = registerItem("decaying_skull", new Item(new FabricItemSettings()));
    public static final Item DECREPIT_CROWN = registerItem("decrepit_crown", new Item(new FabricItemSettings()));
    public static final Item DEMON_HORN = registerItem("demon_horn", new Item(new FabricItemSettings()));
    public static final Item DEMONIC_LEATHER = registerItem("demonic_leather", new Item(new FabricItemSettings()));
    public static final Item DENTED_HELMET = registerItem("dented_helmet", new Item(new FabricItemSettings()));
    public static final Item DRIED_HERBS = registerItem("dried_herbs", new Item(new FabricItemSettings()));
    public static final Item DULL_AXE = registerItem("dull_axe", new Item(new FabricItemSettings()));
    public static final Item DUSTY_GOBLET = registerItem("dusty_goblet", new Item(new FabricItemSettings()));
    public static final Item DUSTY_TOME = registerItem("dusty_tome", new Item(new FabricItemSettings()));
    public static final Item EMPTY_COFFER = registerItem("empty_coffer", new Item(new FabricItemSettings()));
    public static final Item EMPTY_FLASK = registerItem("empty_flask", new Item(new FabricItemSettings()));
    public static final Item ENGRAVED_LOCKET = registerItem("engraved_locket", new Item(new FabricItemSettings()));
    public static final Item FORGOTTEN_IDOL = registerItem("forgotten_idol", new Item(new FabricItemSettings()));
    public static final Item FOSSILIZED_EGG = registerItem("fossilized_egg", new Item(new FabricItemSettings()));
    public static final Item FOSSILIZED_TOOTH = registerItem("fossilized_tooth", new Item(new FabricItemSettings()));
    public static final Item FRAYED_ROPE = registerItem("frayed_rope", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_KEY = registerItem("golden_key", new Item(new FabricItemSettings()));
    public static final Item GOLDEN_NECKLACE = registerItem("golden_necklace", new Item(new FabricItemSettings()));
    public static final Item HEALING_HERB = registerItem("healing_herb", new Item(new FabricItemSettings()));

    public static final Item HEARTHSTEAD_BRIGADE_WARHAMMER = registerItem("hearthstead_brigade_warhammer",
            new HammerItem(ToolMaterials.NETHERITE, 3, -3.0f, new Item.Settings().fireproof()));

    public static final Item IRON_CUFFS = registerItem("iron_cuffs", new Item(new FabricItemSettings()));
    public static final Item IRON_KEY = registerItem("iron_key", new Item(new FabricItemSettings()));
    public static final Item IRON_SPIKE = registerItem("iron_spike", new Item(new FabricItemSettings()));
    public static final Item JEWELED_CHALICE = registerItem("jeweled_chalice", new Item(new FabricItemSettings()));
    public static final Item JEWELED_CROWN = registerItem("jeweled_crown", new Item(new FabricItemSettings()));
    public static final Item MOLDY_CHEESE = registerItem("moldy_cheese", new Item(new FabricItemSettings()));
    public static final Item MOSS = registerItem("moss", new Item(new FabricItemSettings()));
    public static final Item MOSS_COVERED_IDOL = registerItem("moss_covered_idol", new Item(new FabricItemSettings()));
    public static final Item MOLDY_BREAD = registerItem("moldy_bread", new Item(new FabricItemSettings()));
    public static final Item MUMMIFIED_HAND = registerItem("mummified_hand", new Item(new FabricItemSettings()));
    public static final Item MYSTERIOUS_POTION = registerItem("mysterious_potion", new Item(new FabricItemSettings()));
    public static final Item OLD_COINS = registerItem("old_coins", new Item(new FabricItemSettings()));
    public static final Item OLD_STEEL_BASIN = registerItem("old_steel_basin", new Item(new FabricItemSettings()));
    public static final Item PETRIFIED_WOOD = registerItem("petrified_wood", new Item(new FabricItemSettings()));
    public static final Item QUIVER_OF_ARROWS = registerItem("quiver_of_arrows", new Item(new FabricItemSettings()));
    public static final Item REDCAP_MUSHROOM = registerItem("redcap_mushroom", new Item(new FabricItemSettings()));
    public static final Item ROTTEN_CHEST = registerItem("rotten_chest", new Item(new FabricItemSettings()));
    public static final Item RUSTED_KEY = registerItem("rusted_key", new Item(new FabricItemSettings()));
    public static final Item RUSTY_HAMMER = registerItem("rusty_hammer", new Item(new FabricItemSettings()));
    public static final Item RUSTY_SCREW = registerItem("rusty_screw", new Item(new FabricItemSettings()));
    public static final Item RUSTY_SHURIKEN = registerItem("rusty_shuriken", new Item(new FabricItemSettings()));
    public static final Item RUSTY_SWORD = registerItem("rusty_sword", new Item(new FabricItemSettings()));
    public static final Item SCATTERED_BONES = registerItem("scattered_bones", new Item(new FabricItemSettings()));
    public static final Item SCORCHED_SCROLL = registerItem("scorched_scroll", new Item(new FabricItemSettings()));
    public static final Item SEVERED_CLAW = registerItem("severed_claw", new Item(new FabricItemSettings()));
    public static final Item SHADOWY_CLOAK = registerItem("shadowy_cloak", new Item(new FabricItemSettings()));
    public static final Item SHATTERED_ARMOR = registerItem("shattered_armor", new Item(new FabricItemSettings()));
    public static final Item SHATTERED_GEM = registerItem("shattered_gem", new Item(new FabricItemSettings()));
    public static final Item SHATTERED_VASE = registerItem("shattered_vase", new Item(new FabricItemSettings()));
    public static final Item SHREDDED_SCROLL = registerItem("shredded_scroll", new Item(new FabricItemSettings()));
    public static final Item SILK = registerItem("silk", new Item(new FabricItemSettings()));
    public static final Item SKELETON_KEY = registerItem("skeleton_key", new Item(new FabricItemSettings()));
    public static final Item SNAKE_FANG = registerItem("snake_fang", new Item(new FabricItemSettings()));
    public static final Item SOOTY_CANDLESTICK = registerItem("sooty_candlestick", new Item(new FabricItemSettings()));
    public static final Item SPIDER_WEB = registerItem("spider_web", new Item(new FabricItemSettings()));
    public static final Item SPLINTERED_STAFF = registerItem("splintered_staff", new Item(new FabricItemSettings()));
    public static final Item STALE_WATER = registerItem("stale_water", new Item(new FabricItemSettings()));
    public static final Item SUPPLY_BOX = registerItem("supply_box", new Item(new FabricItemSettings()));
    public static final Item TATTERED_MAP = registerItem("tattered_map", new Item(new FabricItemSettings()));
    public static final Item TORN_BANNER = registerItem("torn_banner", new Item(new FabricItemSettings()));
    public static final Item TORN_SCROLL = registerItem("torn_scroll", new Item(new FabricItemSettings()));
    public static final Item UNHOLY_SYMBOL = registerItem("unholy_symbol", new Item(new FabricItemSettings()));
    public static final Item UNLIT_CANDLE = registerItem("unlit_candle", new Item(new FabricItemSettings()));
    public static final Item UNLIT_TORCH = registerItem("unlit_torch", new Item(new FabricItemSettings()));
    public static final Item USED_BANDAGES = registerItem("used_bandages", new Item(new FabricItemSettings()));
    public static final Item WARPED_BOW = registerItem("warped_bow", new Item(new FabricItemSettings()));
    public static final Item WORN_BOOTS = registerItem("worn_boots", new Item(new FabricItemSettings()));
    public static final Item WORN_LOCKET = registerItem("worn_locket", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries  entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LetsDoAddonQuestItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LetsDoAddonQuestItems.LOGGER.info("Registering Mod Items for " + LetsDoAddonQuestItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
