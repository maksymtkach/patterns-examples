package org.example.IteratorPattern;

import java.util.Iterator;

// Використання Iterator Pattern
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem("Pizza");
        menu.addItem("Pasta");
        menu.addItem("Salad");

        Iterator<String> iterator = menu.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}