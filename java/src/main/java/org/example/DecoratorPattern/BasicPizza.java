package org.example.DecoratorPattern;

class BasicPizza implements FoodOrder {
    @Override
    public String getDescription() {
        return "Basic pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
