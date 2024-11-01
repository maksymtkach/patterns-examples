package org.example.ObjectPool;

// Використання Object Pool
public class Main {
    public static void main(String[] args) {
        DatabaseConnectionPool pool = new DatabaseConnectionPool(2);

        // Отримання з'єднань з пулу
        DatabaseConnection conn1 = pool.acquireConnection();
        DatabaseConnection conn2 = pool.acquireConnection();
        DatabaseConnection conn3 = pool.acquireConnection();

        pool.releaseConnection(conn1);

        DatabaseConnection conn4 = pool.acquireConnection();
    }
}
