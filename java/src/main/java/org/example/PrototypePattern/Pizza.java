package org.example.PrototypePattern;

public class Pizza extends MenuItem {
    public Pizza() {
        name = "Pizza";
        price = 10.00;
    }

    @Override
    public MenuItem clone() {
        try {
            return (Pizza) super.clone(); // створення копії екземпляра Pizza за допомогою Object.clone()
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}