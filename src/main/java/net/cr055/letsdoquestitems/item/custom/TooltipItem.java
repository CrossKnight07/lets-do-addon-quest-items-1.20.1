package net.cr055.letsdoquestitems.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TooltipItem extends Item {
    public TooltipItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        String key = itemStack.getItem().getTranslationKey() + ".tooltip." + itemStack.getItem().getTranslationKey();
        tooltip.add(Text.translatable(key));
        super.appendTooltip(itemStack, world, tooltip, context);
    }
}
