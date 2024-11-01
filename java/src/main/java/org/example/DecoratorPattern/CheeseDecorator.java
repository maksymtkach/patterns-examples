package org.example.DecoratorPattern;

// Конкретний декоратор для сиру
class CheeseDecorator extends OrderDecorator {
    public CheeseDecorator(FoodOrder order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return order.getCost() + 1.50;
    }
}
