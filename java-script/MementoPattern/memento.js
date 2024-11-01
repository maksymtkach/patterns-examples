// Замовлення (Originator)
class Order {
    constructor() {
        this.orderDetails = "";
    }

    setOrderDetails(details) {
        this.orderDetails = details;
    }

    getOrderDetails() {
        return this.orderDetails;
    }

    save() {
        return new OrderMemento(this.orderDetails);
    }

    restore(memento) {
        this.orderDetails = memento.getOrderDetails();
    }
}

// Стан замовлення (Memento)
class OrderMemento {
    constructor(orderDetails) {
        this.orderDetails = orderDetails;
    }

    getOrderDetails() {
        return this.orderDetails;
    }
}

// Історія замовлень (Caretaker)
class OrderHistory {
    constructor() {
        this.history = [];
    }

    saveOrder(order) {
        this.history.push(order.save());
    }

    undo(order) {
        if (this.history.length) {
            order.restore(this.history.pop());
        }
    }
}

const order = new Order();
const history = new OrderHistory();

order.setOrderDetails("Pizza with extra cheese");
history.saveOrder(order);

order.setOrderDetails("Burger with fries");
history.saveOrder(order);

console.log("Current Order:", order.getOrderDetails());

history.undo(order);
console.log("Undo Order:", order.getOrderDetails());

history.undo(order);
console.log("Undo Order:", order.getOrderDetails());
