package org.example.Proxy;

public class DatabaseProxy implements DatabaseInterface {

    private final DatabaseImpl database;

    public DatabaseProxy(DatabaseImpl database) {
        this.database = database;
    }

    @Override
    public void connect() {
        System.out.println("Connected to localhost:5432/" + database.databaseName());
    }
}
