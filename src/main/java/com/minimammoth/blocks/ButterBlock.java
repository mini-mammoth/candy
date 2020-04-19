package com.minimammoth.blocks;

import com.minimammoth.Candy;
import net.minecraft.block.Block;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class ButterBlock extends BreakableBlock {

    public ButterBlock() {

        super(Block.Properties.create(Material.CLAY)
                .slipperiness(1.05F)
                .sound(SoundType.SLIME)
        );

        setRegistryName(new ResourceLocation(Candy.MODID, "block_butter"));
    }
}
