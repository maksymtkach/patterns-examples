package org.example.StatePattern;

// Контекст - Замовлення
class Order {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleOrder();
    }
}

