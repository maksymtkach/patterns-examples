package org.example.FactoryMethodPattern;

// Клас TableReservation реалізує резервування столика
class TableReservation extends Reservation {
    public void reserve() {
        System.out.println("Table reserved");
    }
}
