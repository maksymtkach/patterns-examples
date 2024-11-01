package org.example.AbstractFactoryPattern;

// Абстрактна фабрика для створення сімейств об'єктів
interface RestaurantFactory {
    Table createTable();
    Food createFood();
}
