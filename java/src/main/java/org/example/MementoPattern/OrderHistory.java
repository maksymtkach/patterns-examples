package org.example.MementoPattern;

import java.util.ArrayList;
import java.util.List;

// Історія замовлень (Caretaker)
class OrderHistory {
    private final List<OrderMemento> history = new ArrayList<>();

    public void saveOrder(Order order) {
        history.add(order.save());
    }

    public void undo(Order order) {
        if (!history.isEmpty()) {
            order.restore(history.remove(history.size() - 1));
        }
    }
}
