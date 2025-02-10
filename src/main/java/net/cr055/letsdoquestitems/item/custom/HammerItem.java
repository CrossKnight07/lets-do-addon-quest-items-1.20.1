package net.cr055.letsdoquestitems.item.custom;

import net.cr055.letsdoquestitems.sound.ModSounds;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HammerItem extends SwordItem {

    public HammerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    // Allows user to leap on use, and plays leap sound.
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 50);
        HammerItem.setItem(itemStack);

        if (user.isOnGround()) {
            user.addVelocity(user.getRotationVector().multiply(1.5F));

            user.playSound(ModSounds.HAMMER_LEAP_SOUND, 0.75f, 1f);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    // Should play custom hit sound when hitting a mob.
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            player.playSound(ModSounds.HAMMER_HIT_SOUND, 1f, 1f);
        }
        return super.postHit(stack, target, attacker);
    }

    private static void setItem(ItemStack itemStack) {
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.lets-do-quest-items.hearthstead_brigade_warhammer.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
