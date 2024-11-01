package org.example.StatePattern;

// Конкретний стан: Приготування
class PreparingState implements OrderState {
    public void handleOrder() {
        System.out.println("Order is being prepared.");
    }
}
