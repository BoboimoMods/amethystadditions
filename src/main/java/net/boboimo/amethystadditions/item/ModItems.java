package net.boboimo.amethystadditions.item;

import net.boboimo.amethystadditions.AmethystAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterial.AMETHYST, 2, 1f,
                new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterial.AMETHYST, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new ModPickaxeItem(ModToolMaterial.AMETHYST, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new ModAxeItem(ModToolMaterial.AMETHYST, 4, -1f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new ModHoeItem(ModToolMaterial.AMETHYST, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.AMETHYST)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AmethystAdditions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for" + AmethystAdditions.MOD_ID);
    }
}
