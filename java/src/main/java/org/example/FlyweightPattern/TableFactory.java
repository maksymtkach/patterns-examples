package org.example.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

// Фабрика для створення столиків за шаблоном Flyweight
class TableFactory {
    public Map<Integer, Table> tableMap = new HashMap<>();

    public Table getTable(int tableNumber) {
        tableMap.putIfAbsent(tableNumber, new Table(tableNumber));
        return tableMap.get(tableNumber);
    }
}
