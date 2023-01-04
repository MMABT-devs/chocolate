package massblabla.mod.chocolate.registry;

import massblabla.mod.chocolate.ChocolateMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHOCOLATE_ITEMS = FabricItemGroupBuilder.build(new Identifier(ChocolateMod.LOGGER.getName(), "chocolate_items"), () -> new ItemStack(ModItems.TEST));
}
