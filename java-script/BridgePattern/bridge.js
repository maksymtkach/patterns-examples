// Реалізація FoodType
class VeganFood {
    prepareFood() {
        console.log("Preparing vegan food");
    }
}

class MeatFood {
    prepareFood() {
        console.log("Preparing meat food");
    }
}

// Абстракція для замовлення
class FoodOrder {
    constructor(foodType) {
        this.foodType = foodType;
    }

    order() {
        this.foodType.prepareFood();
    }
}

const veganLunch = new FoodOrder(new VeganFood());
veganLunch.order();

const meatDinner = new FoodOrder(new MeatFood());
meatDinner.order();
