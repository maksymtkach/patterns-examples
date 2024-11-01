package org.example.FacadePattern;

// Використання Facade Pattern
public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurantFacade = new RestaurantFacade();
        restaurantFacade.orderDinner("Pizza", 15.0);
    }
}
