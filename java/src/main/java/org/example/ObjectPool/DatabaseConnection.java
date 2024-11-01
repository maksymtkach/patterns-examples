package org.example.ObjectPool;

import java.util.LinkedList;
import java.util.Queue;

// Клас DatabaseConnection для об'єктів пулу
class DatabaseConnection {
    private boolean inUse;

    public DatabaseConnection() {
        this.inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from database...");
    }
}

// Клас ObjectPool для керування пулом з'єднань
class DatabaseConnectionPool {
    private Queue<DatabaseConnection> availableConnections = new LinkedList<>();
    private int poolSize;

    public DatabaseConnectionPool(int size) {
        this.poolSize = size;
        for (int i = 0; i < size; i++) {
            availableConnections.add(new DatabaseConnection());
        }
    }

    public DatabaseConnection acquireConnection() {
        for (DatabaseConnection connection : availableConnections) {
            if (!connection.isInUse()) {
                connection.setInUse(true);
                connection.connect();
                return connection;
            }
        }
        System.out.println("No available connections.");
        return null;
    }

    public void releaseConnection(DatabaseConnection connection) {
        if (connection != null) {
            connection.disconnect();
            connection.setInUse(false);
        }
    }
}

