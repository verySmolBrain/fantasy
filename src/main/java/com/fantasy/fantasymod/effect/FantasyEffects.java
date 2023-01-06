package com.fantasy.fantasymod.effect;

import com.fantasy.fantasymod.Fantasy;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FantasyEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Fantasy.MODID);

    public static final RegistryObject<MobEffect> ARMOUR = EFFECTS.register(
        "armour", 
        () -> (new ArmourEffect(MobEffectCategory.BENEFICIAL, 0xA57B3F))
            .addAttributeModifier(
            Attributes.ARMOR_TOUGHNESS,
            "3354caa0-8dd6-11ed-a1eb-0242ac120002", (double)0.1F,
            AttributeModifier.Operation.MULTIPLY_TOTAL
        )
    );
}
