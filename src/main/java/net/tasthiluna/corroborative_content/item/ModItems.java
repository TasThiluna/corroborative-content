package net.tasthiluna.corroborative_content.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tasthiluna.corroborative_content.CorroborativeContent;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CorroborativeContent.MOD_ID);

    public static final RegistryObject<Item> BLACK_DIAMOND = ITEMS.register("black_diamond",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //region Colored bricks
    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LIME_BRICK = ITEMS.register("lime_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //endregion


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
