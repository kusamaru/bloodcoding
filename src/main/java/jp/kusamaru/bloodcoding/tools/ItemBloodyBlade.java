package jp.kusamaru.bloodcoding.tools;

import jp.kusamaru.bloodcoding.material.Materials;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemTier;
import net.minecraft.item.IItemTier;

public class ItemBloodyBlade extends SwordItem
{
    public ItemBloodyBlade(Properties properties)
    {
        super(Materials.MATERIAL_BLOODY, 1, -0.5F, properties);
    }
}