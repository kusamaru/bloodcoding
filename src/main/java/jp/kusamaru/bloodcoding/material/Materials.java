package jp.kusamaru.bloodcoding.material;

import jp.kusamaru.bloodcoding.item.Items;
import net.minecraft.item.BlockItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum Materials implements IItemTier
{
    // Enum
    MATERIAL_BLOODY(4, 0, 15f, 3.0f, 25, Items.BLOCK_BLOOD_CLUSTER);

    // Member
    private float attackDamage, efficiency;
    private int maxUses, harvestLevel, enchantability;
    private Item repairMaterial;

    // Const
    private Materials(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Item repairMaterialIn)
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
    }

    // Method
    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public float getEfficiency()
    {
        return efficiency;
    }

    @Override
    public int getMaxUses()
    {
        return maxUses;
    }

    @Override
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(this.repairMaterial);
    }
}