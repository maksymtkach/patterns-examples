package org.example.BridgePattern;

class DinnerOrder extends FoodOrder {
    public DinnerOrder(FoodType foodType) {
        super(foodType);
    }

    public void order() {
        System.out.print("Dinner order: ");
        foodType.prepareFood();
    }
}