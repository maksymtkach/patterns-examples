package org.example.CommandPattern;

// Використання Command Pattern
public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Command foodOrder = new OrderFoodCommand("Pizza");
        Command drinkOrder = new OrderDrinkCommand("Cola");

        waiter.takeOrder(foodOrder);
        waiter.takeOrder(drinkOrder);
    }
}
