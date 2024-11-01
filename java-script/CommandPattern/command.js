// Команда для замовлення
class OrderCommand {
    execute() {}
}

// Конкретна команда для їжі
class OrderFoodCommand extends OrderCommand {
    constructor(food) {
        super();
        this.food = food;
    }

    execute() {
        console.log(`Ordering ${this.food}`);
    }
}

// Конкретна команда для напоїв
class OrderDrinkCommand extends OrderCommand {
    constructor(drink) {
        super();
        this.drink = drink;
    }

    execute() {
        console.log(`Ordering ${this.drink}`);
    }
}

// Invoker для виконання команд
class Waiter {
    takeOrder(command) {
        command.execute();
    }
}

const waiter = new Waiter();
const foodOrder = new OrderFoodCommand("Pizza");
const drinkOrder = new OrderDrinkCommand("Cola");

waiter.takeOrder(foodOrder);
waiter.takeOrder(drinkOrder);
