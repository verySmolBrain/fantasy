package com.fantasy.fantasymod;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

public final class FantasyConfig {
    public static class Common {
        public final ForgeConfigSpec.BooleanValue SKELETON_CONFIG;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("general");

            SKELETON_CONFIG = builder
                    .comment("This is a skeleton template for configuration options")
                    .translation("fantasy.config.common.test")
                    .define("test", true);

            builder.pop();
        }
    }

    public static class Client {
        public final ForgeConfigSpec.BooleanValue SKELETON_CONFIG;

        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("general");

            SKELETON_CONFIG = builder
                    .comment("This is a skeleton template for configuration options")
                    .translation("fantasy.config.client.test")
                    .define("test", true);

            builder.pop();
        }
    }

    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;
    
    public static final ForgeConfigSpec CLIENT_SPEC;
    public static final Client CLIENT;

    static {
        final Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = commonSpecPair.getRight();
        COMMON = commonSpecPair.getLeft();

        final Pair<Client, ForgeConfigSpec> clientSpecPair = new ForgeConfigSpec.Builder().configure(Client::new);
        CLIENT_SPEC = clientSpecPair.getRight();
        CLIENT = clientSpecPair.getLeft();
    }
}
