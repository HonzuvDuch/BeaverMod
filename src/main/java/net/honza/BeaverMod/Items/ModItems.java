package net.honza.BeaverMod.Items;

import net.honza.BeaverMod.BeaverMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeaverMod.MODID);

    //Place for adding new items

    public static final RegistryObject<Item> STEEL = ITEMS.register("steelfromflint",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BeaverTail = ITEMS.register("beavertail",
            () -> new Item(new Item.Properties()));

    //__________________________

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
