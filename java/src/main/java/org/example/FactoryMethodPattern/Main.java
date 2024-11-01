package org.example.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        Reservation tableReservation = ReservationFactory.createReservation("Table");
        tableReservation.reserve();

        Reservation takeoutOrder = ReservationFactory.createReservation("Takeout");
        takeoutOrder.reserve();
    }
}
