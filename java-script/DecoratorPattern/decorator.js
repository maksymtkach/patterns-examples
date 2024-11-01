// Базове замовлення
class BasicPizza {
    getDescription() {
        return "Basic pizza";
    }

    getCost() {
        return 5.00;
    }
}

// Декоратор для сиру
class CheeseDecorator {
    constructor(order) {
        this.order = order;
    }

    getDescription() {
        return this.order.getDescription() + ", Cheese";
    }

    getCost() {
        return this.order.getCost() + 1.50;
    }
}

let order = new BasicPizza();
order = new CheeseDecorator(order);

console.log(order.getDescription() + " costs $" + order.getCost());
