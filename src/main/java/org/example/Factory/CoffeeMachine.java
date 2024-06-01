package org.example.Factory;

public class CoffeeMachine {

    public void makeCoffee(CoffeeType coffeeType) {
        CoffeeInterface coffee = CoffeeFactory.getCoffee(coffeeType);
        grindCoffeeBeans();
        System.out.println("Start making a cup of fresh " + coffee.getVariety());
    }

    private void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans carefully");
    }

}
