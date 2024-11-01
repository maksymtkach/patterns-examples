package org.example.BridgePattern;

// Конкретні реалізації
class VeganFood implements FoodType {
    public void prepareFood() {
        System.out.println("Preparing vegan food");
    }
}
