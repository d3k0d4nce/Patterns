package org.example.Factory;

public class CoffeeFactory {
    public static CoffeeInterface getCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            default -> throw new IllegalArgumentException("There is no coffee like this.");
        };
    }
}
