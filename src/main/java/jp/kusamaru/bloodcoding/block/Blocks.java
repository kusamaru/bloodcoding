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
    public static Block BLOCK_MOB_BLOOD = register("block_mob_blood", new Block(AbstractBlock.Properties.create(Material.SNOW).hardnessAndResistance(2.5F).sound(SoundType.SNOW)));
    public static Block BLOCK_BLOOD_CLUSTER = register("block_blood_cluster", new Block(AbstractBlock.Properties.create(Material.SNOW).hardnessAndResistance(2.5F).sound(SoundType.SNOW)));

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