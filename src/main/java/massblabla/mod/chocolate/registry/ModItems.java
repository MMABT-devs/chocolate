package massblabla.mod.chocolate.registry;

import massblabla.mod.chocolate.ChocolateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TEST = new Item(new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS));
    public static final Item CACAO_POD = new Item(new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS));
    public static final Item CREAM = new Item(new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS));
    public static final Item CHOCOLATE = new Item(new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS).food(ModFoodComponents.CHOCOLATE));
    public static final Item CHOCOLATE_BAR = new Item(new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS).food(ModFoodComponents.CHOCOLATE_BAR));
    public static final Item SANDWICH_COOKIE = new Item(new FabricItemSettings().group(ModItemGroup.CHOCOLATE_ITEMS).food(ModFoodComponents.SANDWICH_COOKIE));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "test"), TEST);
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "cacao_pod"), CACAO_POD);
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "cream"), CREAM);
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "chocolate"), CHOCOLATE);
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "chocolate_bar"), CHOCOLATE_BAR);
        Registry.register(Registry.ITEM, new Identifier(ChocolateMod.LOGGER.getName(), "sandwich_cookie"), SANDWICH_COOKIE);
    }
}
