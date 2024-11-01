package org.example.ChainOfResponsibilityPattern;

// Обробник для напоїв
class DrinkHandler extends OrderHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Drink")) {
            System.out.println("Drink order handled.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
