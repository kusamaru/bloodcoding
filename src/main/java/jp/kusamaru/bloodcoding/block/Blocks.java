package jp.kusamaru.bloodcoding.block;


import jp.kusamaru.bloodcoding.BloodCoding;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = BloodCoding.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks
{
    public static List<Block> blockList = new ArrayList<Block>();

    public static Block BLOCK_BLOOD_BATTERY = register("block_blood_battery", new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1F).sound(SoundType.METAL)));    
    public static Block BLOCK_BLOOD_INJECTOR = register("block_blood_injector", new BlockBloodInjector(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(1F).sound(SoundType.METAL)));    
    public static Block BLOCK_MOB_BLOOD = register("block_mob_blood", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.25F).sound(SoundType.SLIME)));
    public static Block BLOCK_BLOOD_CLUSTER = register("block_blood_cluster", new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(0.25F).sound(SoundType.SLIME)));

    private static Block register(String key, Block blockIn)
    {
        blockList.add(blockIn);
        return blockIn.setRegistryName(BloodCoding.MOD_ID, key);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        for (Block block : blockList)
        {
            event.getRegistry().register(block);
        }
    }
}