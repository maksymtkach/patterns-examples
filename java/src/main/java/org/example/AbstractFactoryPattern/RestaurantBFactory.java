package org.example.AbstractFactoryPattern;

// Фабрика для ресторану B
class RestaurantBFactory implements RestaurantFactory {
    public Table createTable() {
        return new BTable();
    }

    public Food createFood() {
        return new BFood();
    }
}
