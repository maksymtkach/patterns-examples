package org.example.ObserverPattern;

// Використання Observer Pattern
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Preparing");
        order.setStatus("Ready for pickup");
    }
}
