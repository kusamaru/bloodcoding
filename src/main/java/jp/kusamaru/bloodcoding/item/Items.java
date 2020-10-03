package jp.kusamaru.bloodcoding.item;


import jp.kusamaru.bloodcoding.BloodCoding;
import jp.kusamaru.bloodcoding.block.Blocks;
import jp.kusamaru.bloodcoding.tools.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = BloodCoding.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Items
{
    public static List<Item> itemList = new ArrayList<Item>();

    public static final Item ITEM_BLOODY_BLADE = register("item_bloody_blade", new Item((new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final Item ITEM_MOB_BLOOD = register("item_mob_blood", new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final Item ITEM_RED_STICK = register("item_red_stick", new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final Item ITEM_BLOOD_STAR = register("item_blood_star", new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));
    public static final Item BLOCK_MOB_BLOOD = register("block_mob_blood", Blocks.BLOCK_MOB_BLOOD, ItemGroup.BUILDING_BLOCKS);
    public static final Item BLOCK_BLOOD_CLUSTER = register("block_blood_cluster", Blocks.BLOCK_BLOOD_CLUSTER, ItemGroup.BUILDING_BLOCKS);

    private static Item register(String key, Item itemIn)
    {
        itemList.add(itemIn);
        return itemIn.setRegistryName(BloodCoding.MOD_ID, key);
    }

    private static Item register(String key, Block blockIn, ItemGroup itemGroupIn) {
        return register(key, new BlockItem(blockIn, (new Item.Properties()).group(itemGroupIn)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        for (Item item : itemList)
        {
            event.getRegistry().register(item);
        }
    }
}