package com.fantasy.fantasymod.item.potions;

import com.fantasy.fantasymod.effect.FantasyEffects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class ArmourPotion extends Potion {
    public ArmourPotion(MobEffectInstance ... effects) {
        super(new MobEffectInstance(FantasyEffects.ARMOUR_EFFECT.get(), 3600, 0));
    }
}
