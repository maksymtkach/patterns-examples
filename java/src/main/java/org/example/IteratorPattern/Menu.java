package org.example.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Меню ресторану
class Menu {
    private List<String> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public Iterator<String> iterator() {
        return items.iterator();
    }
}
