package org.example.MementoPattern;

// Використання Memento Pattern
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        OrderHistory history = new OrderHistory();

        order.setOrderDetails("Pizza with extra cheese");
        history.saveOrder(order);

        order.setOrderDetails("Burger with fries");
        history.saveOrder(order);

        System.out.println("Current Order: " + order.getOrderDetails());

        history.undo(order);
        System.out.println("Undo Order: " + order.getOrderDetails());

        history.undo(order);
        System.out.println("Undo Order: " + order.getOrderDetails());
    }
}
