package org.example.CompositePattern;
import java.util.ArrayList;
import java.util.List;
// Використання Composite Pattern
public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main Menu");
        MenuItem item1 = new MenuItem("Pizza");
        MenuItem item2 = new MenuItem("Salad");

        Menu subMenu = new Menu("Drinks");
        subMenu.add(new MenuItem("Cola"));
        subMenu.add(new MenuItem("Water"));

        mainMenu.add(item1);
        mainMenu.add(item2);
        mainMenu.add(subMenu);

        mainMenu.display();
    }
}