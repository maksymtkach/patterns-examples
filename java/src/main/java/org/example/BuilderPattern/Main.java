package org.example.BuilderPattern;

// Використання Builder
public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder.Builder("Pizza")
                .sideDish("Salad")
                .drink("Cola")
                .takeout(true)
                .build();

        System.out.println(order);
    }
}
