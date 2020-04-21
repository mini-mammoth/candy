package com.minimammoth.items;

import com.minimammoth.Candy;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class ButterItem extends Item {

    public ButterItem(){
        super(new Item.Properties().group(ItemGroup.FOOD).food(Foods.BREAD));
        setRegistryName(new ResourceLocation(Candy.MODID, "item_butter"));
    }


}
