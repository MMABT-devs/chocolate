package massblabla.mod.chocolate.registry;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHOCOLATE = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.2F).build();
    public static final FoodComponent CHOCOLATE_BAR = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.4F).build();
    public static final FoodComponent SANDWICH_COOKIE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.4F).build();
}
