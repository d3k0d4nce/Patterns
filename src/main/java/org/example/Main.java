package org.example;

import org.example.Adapter.Computer;
import org.example.Adapter.MemoryCard;
import org.example.Adapter.USB;
import org.example.Adapter.MemoryCardAdapter;
import org.example.Factory.CoffeeMachine;
import org.example.Factory.CoffeeType;
import org.example.Proxy.DatabaseImpl;
import org.example.Proxy.DatabaseProxy;
import org.example.Singleton.Logging;

public class Main {
    public static void main(String[] args) {

        System.out.println(Logging.ofLogging().classLog(Logging.class, "Hello, Logging!"));

        new CoffeeMachine().makeCoffee(CoffeeType.ESPRESSO);

        Computer computer = new Computer();
        computer.connect(new USB());
        computer.connect(new MemoryCardAdapter(new MemoryCard()));

        DatabaseImpl database = new DatabaseImpl("postgres");
        DatabaseProxy databaseProxy = new DatabaseProxy(database);
        databaseProxy.connect();

    }
}