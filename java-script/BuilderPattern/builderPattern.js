// Клас FoodOrder з опціями для будівництва замовлення
class FoodOrder {
    constructor(builder) {
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.isTakeout = builder.isTakeout;
    }

    details() {
        return `Order: ${this.mainDish}, Side: ${this.sideDish}, Drink: ${this.drink}, Takeout: ${this.isTakeout}`;
    }
}

// Клас Builder для створення FoodOrder з різними параметрами
class FoodOrderBuilder {
    constructor(mainDish) {
        this.mainDish = mainDish;
    }

    setSideDish(sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    setDrink(drink) {
        this.drink = drink;
        return this;
    }

    setTakeout(isTakeout) {
        this.isTakeout = isTakeout;
        return this;
    }

    build() {
        return new FoodOrder(this);
    }
}

// Використання Builder
const order = new FoodOrderBuilder("Pizza")
    .setSideDish("Salad")
    .setDrink("Cola")
    .setTakeout(true)
    .build();

console.log(order.details());
