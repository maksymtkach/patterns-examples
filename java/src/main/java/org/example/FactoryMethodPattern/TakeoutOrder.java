package org.example.FactoryMethodPattern;

// Клас TakeoutOrder реалізує бронювання для замовлення на виніс
class TakeoutOrder extends Reservation {
    public void reserve() {
        System.out.println("Takeout order placed");
    }
}
