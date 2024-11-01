package org.example.MediatorPattern;

// Використання Mediator Pattern
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new RestaurantChatMediator();

        User user1 = new Customer(mediator, "Alice");
        User user2 = new Customer(mediator, "Bob");

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hello, everyone!");
        user2.send("Hi, Alice!");
    }
}
