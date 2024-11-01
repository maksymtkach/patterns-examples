package org.example.DecoratorPattern;

// Абстрактний клас декоратора
abstract class OrderDecorator implements FoodOrder {
    protected FoodOrder order;

    public OrderDecorator(FoodOrder order) {
        this.order = order;
    }
}
