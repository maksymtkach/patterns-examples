package org.example.FlyweightPattern;

// Клас столика
class Table {
    private final int tableNumber;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void serve(String customer) {
        System.out.println("Serving " + customer + " at table " + tableNumber);
    }
}
