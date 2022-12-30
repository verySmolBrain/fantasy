package com.fantasy.fantasymod.items;

import com.fantasy.fantasymod.Fantasy;
import com.fantasy.fantasymod.items.potions.ArmourPotion;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FantasyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fantasy.MODID);

    // Potions
    public static final RegistryObject<Potion> ALCHEMIST_FIRE = ITEMS.register("armour_potion", ArmourPotion::new);
}
