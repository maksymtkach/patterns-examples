package org.example.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

// Реалізація посередника для чату
class RestaurantChatMediator implements ChatMediator {
    private List<User> users;

    public RestaurantChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
