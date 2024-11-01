package org.example.AbstractFactoryPattern;

// Конкретні реалізації продуктів (напр. ресторану B)
class BTable implements Table {
    public void reserve() {
        System.out.println("Table reserved in Restaurant B");
    }
}