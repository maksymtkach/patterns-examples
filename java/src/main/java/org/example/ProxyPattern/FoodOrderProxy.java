package org.example.ProxyPattern;

// Proxy для контролю доступу
class FoodOrderProxy implements FoodOrder {
    private RealFoodOrder realFoodOrder;
    private boolean isAdmin;

    public FoodOrderProxy(boolean isAdmin) {
        this.realFoodOrder = new RealFoodOrder();
        this.isAdmin = isAdmin;
    }

    @Override
    public void placeOrder(String food) {
        if (isAdmin) {
            realFoodOrder.placeOrder(food);
        } else {
            System.out.println("Access denied. Only admins can place orders.");
        }
    }
}
