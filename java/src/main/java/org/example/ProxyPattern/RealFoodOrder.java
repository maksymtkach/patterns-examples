package org.example.ProxyPattern;

// Реалізація замовлення
class RealFoodOrder implements FoodOrder {
    public void placeOrder(String food) {
        System.out.println("Order placed for: " + food);
    }
}