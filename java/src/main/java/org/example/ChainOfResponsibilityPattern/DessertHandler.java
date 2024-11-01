package org.example.ChainOfResponsibilityPattern;

// Обробник для десертів
class DessertHandler extends OrderHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Dessert")) {
            System.out.println("Dessert order handled.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
