package org.example.BridgePattern;

// Різні типи замовлень, які використовують FoodType
class LunchOrder extends FoodOrder {
    public LunchOrder(FoodType foodType) {
        super(foodType);
    }

    public void order() {
        System.out.print("Lunch order: ");
        foodType.prepareFood();
    }
}