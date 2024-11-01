package org.example.SingletonPattern;

import java.sql.Connection;

// Забезпечення єдиного підключення до бази даних
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    // Приватний конструктор для запобігання створення екземпляра ззовні
    private DatabaseConnection() {
        System.out.println("DB connection created");
    }

    // Метод для отримання єдиного екземпляра класу
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
