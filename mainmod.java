package com.barrow.revelations;

import com.barrow.revelations.blocks.ExperiencePlantBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MainMod implements ModInitializer {

    public static final Block INSIGHT_SPROUT_1 = new ExperiencePlantBlock(100, ParticleTypes.ASH);
    public static final Block INSIGHT_BUSH_2 = new ExperiencePlantBlock(200, ParticleTypes.WARPED_SPORE);
    public static final Block EPIPHANY_SPRIG_3 = new ExperiencePlantBlock(300, ParticleTypes.ENCHANT);
    public static final Block REVELATION_FLOWER_4 = new ExperiencePlantBlock(400, ParticleTypes.NAUTILUS);

    @Override
    public void onInitialize() {
        registerBlock(INSIGHT_SPROUT_1, "insight_sprout_1");
        registerBlock(INSIGHT_BUSH_2, "insight_bush_2");
        registerBlock(EPIPHANY_SPRIG_3, "epiphany_sprig_3");
        registerBlock(REVELATION_FLOWER_4, "revelation_flower_4");
    }

    private void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier("barrows_revelations", name), block);
        Registry.register(Registry.ITEM, new Identifier("barrows_revelations", name), new BlockItem(block, new Item.Settings()));
    }
}
