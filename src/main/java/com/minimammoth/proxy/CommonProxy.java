package com.minimammoth.proxy;

import com.minimammoth.Candy;
import com.minimammoth.blocks.ButterBlock;
import com.minimammoth.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> registry){
        LOGGER.info("HELLO from Register Items");

        registry.getRegistry().registerAll(
                new Item((new Item.Properties()).group(ItemGroup.FOOD).food(Foods.BREAD)).setRegistryName(new ResourceLocation(Candy.MODID, "item_butter")),
                new BlockItem(ModBlocks.BUTTER_BLOCK, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(new ResourceLocation(Candy.MODID, "block_butter"))
        );
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> registry) {
        // register a new block here

        registry.getRegistry().registerAll(
                new ButterBlock()
        );
    }
}
