package org.example.ChainOfResponsibilityPattern;

// Використання Chain of Responsibility Pattern
public class Main {
    public static void main(String[] args) {
        OrderHandler drinkHandler = new DrinkHandler();
        OrderHandler foodHandler = new FoodHandler();
        OrderHandler dessertHandler = new DessertHandler();

        drinkHandler.setNextHandler(foodHandler);
        foodHandler.setNextHandler(dessertHandler);

        drinkHandler.handleRequest("Dessert");
        drinkHandler.handleRequest("Food");
    }
}
