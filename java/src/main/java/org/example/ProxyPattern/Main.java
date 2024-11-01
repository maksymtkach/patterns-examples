package org.example.ProxyPattern;

// Використання Proxy Pattern
public class Main {
    public static void main(String[] args) {
        FoodOrder adminOrder = new FoodOrderProxy(true);
        adminOrder.placeOrder("Pizza");

        FoodOrder userOrder = new FoodOrderProxy(false);
        userOrder.placeOrder("Pasta");
    }
}
