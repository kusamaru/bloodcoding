package jp.kusamaru.bloodcoding.tools;

import jp.kusamaru.bloodcoding.material.Materials;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemTier;

public class ItemBloodyBlade extends SwordItem
{
    public ItemBloodyBlade(Properties properties)
    {
        super(Materials.MATERIAL_BLOODY, 5, -1F, properties);
    }
}