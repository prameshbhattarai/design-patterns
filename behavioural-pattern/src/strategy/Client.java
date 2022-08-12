package strategy;

import strategy.implementations.ASCSortingStrategy;
import strategy.implementations.Context;
import strategy.implementations.DESCSortingStrategy;

/**
 * Strategy is a behavioral design pattern that turns a set of behaviors into objects and makes them 
 * interchangeable inside original context object.
 */
public class Client {

    public static void main(String... args) {
        Context context = new Context(new ASCSortingStrategy());
        context.startSorting();

        System.out.println("Change the strategy in the context");
        context.changeStrategy(new DESCSortingStrategy());
        context.startSorting();
    }
}
