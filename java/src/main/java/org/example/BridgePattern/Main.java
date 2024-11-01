package org.example.BridgePattern;

// Використання Bridge
public class Main {
    public static void main(String[] args) {
        FoodOrder lunchOrder = new LunchOrder(new VeganFood());
        lunchOrder.order();

        FoodOrder dinnerOrder = new DinnerOrder(new MeatFood());
        dinnerOrder.order();
    }
}