package org.example.CommandPattern;

// Invoker для виконання команд
class Waiter {
    public void takeOrder(Command command) {
        command.execute();
    }
}
