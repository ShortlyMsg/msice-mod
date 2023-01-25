package com.shortlymsg.msice.item;

import com.shortlymsg.msice.Msice;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Msice.MOD_ID);

    public static final RegistryObject<Item> SICE = ITEMS.register("sice",
            () -> new Item(new Item.Properties().tab(ModCreativeItemModeTab.MSICE_TAB)));

    public static final RegistryObject<Item> SICE_CRYSTAL = ITEMS.register("sice_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeItemModeTab.MSICE_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
