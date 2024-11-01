package org.example.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

// Використання Flyweight Pattern
public class Main {
    public static void main(String[] args) {
        TableFactory tableFactory = new TableFactory();

        Table table1 = tableFactory.getTable(1);
        table1.serve("Customer A");

        Table table2 = tableFactory.getTable(1);
        table2.serve("Customer B");

        System.out.println("Total unique tables created: " + tableFactory.tableMap.size());
    }
}
