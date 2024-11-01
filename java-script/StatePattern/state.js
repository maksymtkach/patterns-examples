// Стан замовлення
class PreparingState {
    handleOrder() {
        console.log("Order is being prepared.");
    }
}

class DeliveringState {
    handleOrder() {
        console.log("Order is out for delivery.");
    }
}

class DeliveredState {
    handleOrder() {
        console.log("Order has been delivered.");
    }
}

// Контекст - Замовлення
class Order {
    setState(state) {
        this.state = state;
    }

    processOrder() {
        this.state.handleOrder();
    }
}

const order = new Order();

order.setState(new PreparingState());
order.processOrder();

order.setState(new DeliveringState());
order.processOrder();

order.setState(new DeliveredState());
order.processOrder();
