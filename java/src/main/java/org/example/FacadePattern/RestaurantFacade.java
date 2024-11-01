package org.example.FacadePattern;

// Фасад для управління всією підсистемою
class RestaurantFacade {
    private TableReservation tableReservation;
    private FoodOrdering foodOrdering;
    private Payment payment;

    public RestaurantFacade() {
        this.tableReservation = new TableReservation();
        this.foodOrdering = new FoodOrdering();
        this.payment = new Payment();
    }

    public void orderDinner(String food, double amount) {
        tableReservation.reserveTable();
        foodOrdering.orderFood(food);
        payment.makePayment(amount);
        System.out.println("Dinner ordered successfully.");
    }
}
