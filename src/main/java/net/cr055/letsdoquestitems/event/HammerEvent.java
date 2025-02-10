package net.cr055.letsdoquestitems.event;

import net.cr055.letsdoquestitems.sound.ModSounds;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;

public class HammerEvent {
    public static void register() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (!world.isClient && entity instanceof LivingEntity) {
                if (player instanceof PlayerEntity) {
                    world.playSound(null, entity.getBlockPos(), ModSounds.HAMMER_HIT_SOUND, SoundCategory.PLAYERS, 1F, 1F);
                }
            }
            return ActionResult.PASS;
        });
    }
}
