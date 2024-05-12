package com.example.mod;

import com.example.mod.blocks.ExperiencePlantBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MainMod implements ModInitializer {

    public static final Block INSIGHT_SPROUT_1 = new ExperiencePlantBlock(100);
    public static final Block INSIGHT_BUSH_2 = new ExperiencePlantBlock(200);
    public static final Block EPIPHANY_SPRIG_3 = new ExperiencePlantBlock(300);
    public static final Block REVELATION_FLOWER_4 = new ExperiencePlantBlock(400);

    @Override
    public void onInitialize() {
        registerBlock(INSIGHT_SPROUT_1, "insight_sprout_1");
        registerBlock(INSIGHT_BUSH_2, "insight_bush_2");
        registerBlock(EPIPHANY_SPRIG_3, "epiphany_sprig_3");
        registerBlock(REVELATION_FLOWER_4, "revelation_flower_4");
    }

    private void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier("examplemod", name), block);
        Registry.register(Registry.ITEM, new Identifier("examplemod", name), new BlockItem(block, new Item.Settings()));
    }
}
