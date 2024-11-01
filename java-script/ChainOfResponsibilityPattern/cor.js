// Базовий обробник
class OrderHandler {
    setNextHandler(handler) {
        this.nextHandler = handler;
        return handler; // для ланцюжка викликів
    }

    handleRequest(request) {
        if (this.nextHandler) {
            this.nextHandler.handleRequest(request);
        }
    }
}

// Обробник для напоїв
class DrinkHandler extends OrderHandler {
    handleRequest(request) {
        if (request === "Drink") {
            console.log("Drink order handled.");
        } else {
            super.handleRequest(request);
        }
    }
}

// Обробник для їжі
class FoodHandler extends OrderHandler {
    handleRequest(request) {
        if (request === "Food") {
            console.log("Food order handled.");
        } else {
            super.handleRequest(request);
        }
    }
}

// Обробник для десертів
class DessertHandler extends OrderHandler {
    handleRequest(request) {
        if (request === "Dessert") {
            console.log("Dessert order handled.");
        } else {
            super.handleRequest(request);
        }
    }
}

const drinkHandler = new DrinkHandler();
const foodHandler = new FoodHandler();
const dessertHandler = new DessertHandler();

drinkHandler.setNextHandler(foodHandler).setNextHandler(dessertHandler);

drinkHandler.handleRequest("Dessert");
drinkHandler.handleRequest("Food");
