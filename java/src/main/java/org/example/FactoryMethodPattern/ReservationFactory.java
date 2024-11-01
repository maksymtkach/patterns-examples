package org.example.FactoryMethodPattern;

// Фабричний клас ReservationFactory для створення екземплярів
class ReservationFactory {
    public static Reservation createReservation(String type) {
        if (type.equalsIgnoreCase("Table")) {
            return new TableReservation(); // повертає екземпляр TableReservation
        } else if (type.equalsIgnoreCase("Takeout")) {
            return new TakeoutOrder(); // повертає екземпляр TakeoutOrder
        }
        return null; // повертає null, якщо тип не співпадає
    }
}