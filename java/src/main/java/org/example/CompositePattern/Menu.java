package org.example.CompositePattern;

import java.util.ArrayList;
import java.util.List;

// Реалізація меню, яке може містити підменю та елементи
class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Menu: " + name);
        for (MenuComponent component : components) {
            component.display();
        }
    }
}
