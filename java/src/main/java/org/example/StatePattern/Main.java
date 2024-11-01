package org.example.StatePattern;

// Використання State Pattern
public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setState(new PreparingState());
        order.processOrder();

        order.setState(new DeliveringState());
        order.processOrder();

        order.setState(new DeliveredState());
        order.processOrder();
    }
}
