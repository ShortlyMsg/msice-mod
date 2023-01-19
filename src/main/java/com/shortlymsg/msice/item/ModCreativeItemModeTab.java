package com.shortlymsg.msice.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeItemModeTab {

    public static final CreativeModeTab MSICE_TAB = new CreativeModeTab("msicetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SICE.get());
        }
    };
}
