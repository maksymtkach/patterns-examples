// Клас столика
class Table {
    constructor(tableNumber) {
        this.tableNumber = tableNumber;
    }

    serve(customer) {
        console.log(`Serving ${customer} at table ${this.tableNumber}`);
    }
}

// Фабрика для створення столиків за шаблоном Flyweight
class TableFactory {
    constructor() {
        this.tableMap = new Map();
    }

    getTable(tableNumber) {
        if (!this.tableMap.has(tableNumber)) {
            this.tableMap.set(tableNumber, new Table(tableNumber));
        }
        return this.tableMap.get(tableNumber);
    }
}

const tableFactory = new TableFactory();

const table1 = tableFactory.getTable(1);
table1.serve("Customer A");

const table2 = tableFactory.getTable(1);
table2.serve("Customer B");

console.log("Total unique tables created:", tableFactory.tableMap.size);
