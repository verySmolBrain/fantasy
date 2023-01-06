package com.fantasy.fantasymod.item;

import com.fantasy.fantasymod.Fantasy;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Fantasy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FantasyCreativeTabs {
    public static CreativeModeTab FANTASY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        
    }
}
