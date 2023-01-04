package massblabla.mod.chocolate.registry;

import massblabla.mod.chocolate.ChocolateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks  {
    public static final Block CACAO_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES).strength(0.1f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(ChocolateMod.LOGGER.getName(), "cacao_leaves"), CACAO_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "cacao_leaves"), new BlockItem(CACAO_LEAVES, new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS)));
    }
}
