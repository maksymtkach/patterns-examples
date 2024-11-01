package org.example.ObserverPattern;

// Спостерігач
class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Dear " + name + ", your order status is now: " + status);
    }
}
