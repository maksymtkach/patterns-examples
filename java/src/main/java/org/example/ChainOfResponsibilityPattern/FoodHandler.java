package org.example.ChainOfResponsibilityPattern;

// Обробник для їжі
class FoodHandler extends OrderHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Food")) {
            System.out.println("Food order handled.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}