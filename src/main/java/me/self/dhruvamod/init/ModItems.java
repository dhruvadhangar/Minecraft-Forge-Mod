package me.self.dhruvamod.init;

import me.self.dhruvamod.Dhruvamod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Dhruvamod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    
    public static final RegistryObject<Item> TOTEM_OF_DYING = ITEMS.register("totem_of_dying", 
    		(() -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB))));

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
