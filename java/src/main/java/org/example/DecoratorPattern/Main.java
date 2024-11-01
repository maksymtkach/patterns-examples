package org.example.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        FoodOrder order = new BasicPizza();
        order = new CheeseDecorator(order);

        System.out.println(order.getDescription() + " costs $" + order.getCost());
    }
}
