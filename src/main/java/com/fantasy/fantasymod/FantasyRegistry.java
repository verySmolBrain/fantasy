package com.fantasy.fantasymod;

import com.fantasy.fantasymod.block.FantasyBlocks;
import com.fantasy.fantasymod.effect.FantasyEffects;
import com.fantasy.fantasymod.entity.FantasyEntities;
import com.fantasy.fantasymod.item.FantasyItems;
import com.fantasy.fantasymod.item.potions.FantasyPotions;
import com.fantasy.fantasymod.menu.FantasyMenu;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

public final class FantasyRegistry {
    public static void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DeferredRegister<?>[] registers = {
            FantasyBlocks.BLOCKS,
            FantasyItems.ITEMS,
            FantasyPotions.POTIONS,
            FantasyMenu.MENU_TYPES,
            FantasyEntities.ENTITY_TYPES,
            FantasyEffects.EFFECTS,
        };

        for (DeferredRegister<?> register : registers) {
            register.register(modEventBus);
        }
    }
}
