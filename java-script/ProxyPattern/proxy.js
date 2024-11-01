// Реалізація замовлення
class RealFoodOrder {
    placeOrder(food) {
        console.log(`Order placed for: ${food}`);
    }
}

// Proxy для контролю доступу
class FoodOrderProxy {
    constructor(isAdmin) {
        this.realFoodOrder = new RealFoodOrder();
        this.isAdmin = isAdmin;
    }

    placeOrder(food) {
        if (this.isAdmin) {
            this.realFoodOrder.placeOrder(food);
        } else {
            console.log("Access denied. Only admins can place orders.");
        }
    }
}

const adminOrder = new FoodOrderProxy(true);
adminOrder.placeOrder("Pizza");

const userOrder = new FoodOrderProxy(false);
userOrder.placeOrder("Pasta");
