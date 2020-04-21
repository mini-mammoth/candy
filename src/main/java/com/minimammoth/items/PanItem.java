package com.minimammoth.items;

import com.minimammoth.Candy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class PanItem extends Item {

    public PanItem(){
        super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1));
        setRegistryName(new ResourceLocation(Candy.MODID, "item_pan"));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(this);
    }
}
