// Базовий клас Reservation з методом reserve()
class Reservation {
    reserve() {}
}

// резервування столика
class TableReservation extends Reservation {
    reserve() {
        console.log("Table reserved");
    }
}

// замовлення на виніс
class TakeoutOrder extends Reservation {
    reserve() {
        console.log("Takeout order placed");
    }
}

// створення екземплярів
class ReservationFactory {
    static createReservation(type) {
        if (type === "Table") {
            return new TableReservation();
        } else if (type === "Takeout") {
            return new TakeoutOrder();
        }
        return null;
    }
}

const reservation = ReservationFactory.createReservation("Table");
reservation.reserve();

const takeoutOrder = ReservationFactory.createReservation("Takeout");
takeoutOrder.reserve();
