package org.example.BridgePattern;

// Абстракція для замовлення
abstract class FoodOrder {
    protected FoodType foodType;

    public FoodOrder(FoodType foodType) {
        this.foodType = foodType;
    }

    public abstract void order();
}
