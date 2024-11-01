package org.example.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Pizza originalPizza = new Pizza();
        Pizza clonedPizza = (Pizza) originalPizza.clone();

        System.out.println("Original Pizza: " + originalPizza.getName() + ", Price: " + originalPizza.getPrice());
        System.out.println("Cloned Pizza: " + clonedPizza.getName() + ", Price: " + clonedPizza.getPrice());
    }
}
