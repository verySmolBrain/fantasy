package com.fantasy.fantasymod;

import net.minecraftforge.common.ForgeConfigSpec;

public final class FantasyConfig {
    public final ForgeConfigSpec.BooleanValue SKELETON_CONFIG;

    public FantasyConfig(ForgeConfigSpec.Builder builder) {
        builder.push("general");

        SKELETON_CONFIG = builder
                .comment("This is a skeleton template for configuration options")
                .translation("fantasy.config.test")
                .define("test", true);

        builder.pop();
    }

    public boolean testConfig() {
        return SKELETON_CONFIG.get();
    }

    public void bake() {
        // Deciding on whether to make configs baked or not
    }
}
