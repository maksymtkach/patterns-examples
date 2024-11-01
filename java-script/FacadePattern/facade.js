// Система бронювання столиків
class TableReservation {
    reserveTable() {
        console.log("Table reserved.");
    }
}

// Система замовлення їжі
class FoodOrdering {
    orderFood(food) {
        console.log(`${food} ordered.`);
    }
}

// Система оплати
class Payment {
    makePayment(amount) {
        console.log(`Payment of $${amount} completed.`);
    }
}

// Фасад для спрощеного управління підсистемою
class RestaurantFacade {
    constructor() {
        this.tableReservation = new TableReservation();
        this.foodOrdering = new FoodOrdering();
        this.payment = new Payment();
    }

    orderDinner(food, amount) {
        this.tableReservation.reserveTable();
        this.foodOrdering.orderFood(food);
        this.payment.makePayment(amount);
        console.log("Dinner ordered successfully.");
    }
}

const restaurantFacade = new RestaurantFacade();
restaurantFacade.orderDinner("Pizza", 15.0);
