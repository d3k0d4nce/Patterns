package org.example.Proxy;

public record DatabaseImpl(String databaseName) implements DatabaseInterface {
    @Override
    public void connect() {
        System.out.println("Connected to " + databaseName);
    }
}
