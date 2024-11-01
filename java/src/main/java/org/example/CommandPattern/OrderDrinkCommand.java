package org.example.CommandPattern;

// Замовлення для напоїв
class OrderDrinkCommand implements Command {
    private String drink;

    public OrderDrinkCommand(String drink) {
        this.drink = drink;
    }

    public void execute() {
        System.out.println("Ordering " + drink);
    }
}
