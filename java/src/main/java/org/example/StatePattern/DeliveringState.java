package org.example.StatePattern;

// Конкретний стан: Доставляється
class DeliveringState implements OrderState {
    public void handleOrder() {
        System.out.println("Order is out for delivery.");
    }
}
