package org.example.MementoPattern;

// Замовлення (Originator)
class Order {
    private String orderDetails;

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public OrderMemento save() {
        return new OrderMemento(orderDetails);
    }

    public void restore(OrderMemento memento) {
        this.orderDetails = memento.getOrderDetails();
    }
}
