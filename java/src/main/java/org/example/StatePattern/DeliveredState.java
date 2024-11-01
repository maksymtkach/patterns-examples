package org.example.StatePattern;

// Конкретний стан: Доставлено
class DeliveredState implements OrderState {
    public void handleOrder() {
        System.out.println("Order has been delivered.");
    }
}
