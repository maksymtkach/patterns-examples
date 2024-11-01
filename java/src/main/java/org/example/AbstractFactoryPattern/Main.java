package org.example.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        RestaurantFactory factoryA = new RestaurantAFactory();
        Table tableA = factoryA.createTable();
        Food foodA = factoryA.createFood();

        tableA.reserve();
        foodA.serve();

        RestaurantFactory factoryB = new RestaurantBFactory();
        Table tableB = factoryB.createTable();
        Food foodB = factoryB.createFood();

        tableB.reserve();
        foodB.serve();
    }
}
