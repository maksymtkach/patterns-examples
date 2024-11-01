// Клас DatabaseConnection для імітації підключення до бази даних
class DatabaseConnection {
    constructor() {
        this.inUse = false;
    }

    connect() {
        console.log("Connecting to database...");
        this.inUse = true;
    }

    disconnect() {
        console.log("Disconnecting from database...");
        this.inUse = false;
    }

    isAvailable() {
        return !this.inUse;
    }
}

// Клас ConnectionPool для керування пулом з'єднань
class ConnectionPool {
    constructor(size) {
        this.pool = [];
        for (let i = 0; i < size; i++) {
            this.pool.push(new DatabaseConnection());
        }
    }

    acquireConnection() {
        for (const connection of this.pool) {
            if (connection.isAvailable()) {
                connection.connect();
                return connection;
            }
        }
        console.log("No available connections.");
        return null;
    }

    releaseConnection(connection) {
        connection.disconnect();
    }
}

const pool = new ConnectionPool(2);

const conn1 = pool.acquireConnection(); 
const conn2 = pool.acquireConnection(); 
const conn3 = pool.acquireConnection();

pool.releaseConnection(conn1);

const conn4 = pool.acquireConnection();
