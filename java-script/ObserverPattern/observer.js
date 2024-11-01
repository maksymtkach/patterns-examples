// Замовлення (Subject)
class Order {
    constructor() {
        this.observers = [];
        this.status = "";
    }

    addObserver(observer) {
        this.observers.push(observer);
    }

    removeObserver(observer) {
        this.observers = this.observers.filter(obs => obs !== observer);
    }

    setStatus(status) {
        this.status = status;
        this.notifyObservers();
    }

    notifyObservers() {
        this.observers.forEach(observer => observer.update(this.status));
    }
}

// Спостерігач
class Customer {
    constructor(name) {
        this.name = name;
    }

    update(status) {
        console.log(`Dear ${this.name}, your order status is now: ${status}`);
    }
}

const order = new Order();
const customer1 = new Customer("Alice");
const customer2 = new Customer("Bob");

order.add
