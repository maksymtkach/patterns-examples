package org.example.CommandPattern;

// Конкретна команда для замовлення їжі
class OrderFoodCommand implements Command {
    private String food;

    public OrderFoodCommand(String food) {
        this.food = food;
    }

    public void execute() {
        System.out.println("Ordering " + food);
    }
}
