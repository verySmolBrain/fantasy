package com.fantasy.fantasymod;

import com.fantasy.fantasymod.blocks.FantasyBlocks;
import com.fantasy.fantasymod.entities.FantasyEntities;
import com.fantasy.fantasymod.items.FantasyItems;
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
            FantasyMenu.MENU_TYPES,
            FantasyEntities.ENTITY_TYPES
        };

        for (DeferredRegister<?> register : registers) {
            register.register(modEventBus);
        }
    }
}
