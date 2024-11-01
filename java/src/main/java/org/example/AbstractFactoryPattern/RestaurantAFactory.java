package org.example.AbstractFactoryPattern;

// Фабрика для ресторану A
class RestaurantAFactory implements RestaurantFactory {
    public Table createTable() {
        return new ATable();
    }

    public Food createFood() {
        return new AFood();
    }
}
