package net.cr055.letsdoquestitems.item.custom;

import net.cr055.letsdoquestitems.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class HammerItem extends SwordItem {

    public HammerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    // Allows user to leap on use, and plays leap sound.
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 10);
        HammerItem.setItem(itemStack);

        if (user.isOnGround()) {
            user.addVelocity(user.getRotationVector().multiply(1.5F));

            user.playSound(ModSounds.HAMMER_LEAP_SOUND, 1f, 1f);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    // Should play custom hit sound when hitting a mob.
    public ActionResult postHit(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        HammerItem.setItem(itemStack);

        user.playSound(ModSounds.HAMMER_HIT_SOUND, 1f, 1f);

        return ActionResult.SUCCESS;
    }

    private static void setItem(ItemStack itemStack) {
    }
}
