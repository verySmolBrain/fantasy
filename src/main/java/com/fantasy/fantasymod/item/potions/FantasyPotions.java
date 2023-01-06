package com.fantasy.fantasymod.item.potions;

import com.fantasy.fantasymod.Fantasy;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FantasyPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, Fantasy.MODID);

    public static final RegistryObject<Potion> ARMOUR_POTION = POTIONS.register("armour_potion", ArmourPotion::new);
}
