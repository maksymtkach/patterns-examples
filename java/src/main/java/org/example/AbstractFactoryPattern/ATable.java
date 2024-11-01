package org.example.AbstractFactoryPattern;

// Конкретні реалізації продуктів (напр. ресторану A)
class ATable implements Table {
    public void reserve() {
        System.out.println("Table reserved in Restaurant A");
    }
}
