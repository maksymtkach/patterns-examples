package org.example.MementoPattern;

// Стан замовлення (Memento)
class OrderMemento {
    private final String orderDetails;

    public OrderMemento(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderDetails() {
        return orderDetails;
    }
}
