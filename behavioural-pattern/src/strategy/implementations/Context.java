package strategy.implementations;

import strategy.interfaces.Strategy;

import java.util.Arrays;

/**
 * The Context defines the interface of interest to clients.
 */
public class Context {

    private final String[] WORDS = new String[] {"a", "o", "u", "e", "i",};

    private Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void startSorting() {
        System.out.println("------------------");
        System.out.printf("Context:: Start Sorting using %s%n", this.strategy.getClass().getSimpleName());
        this.strategy.sort(WORDS);

        System.out.println("Context:: After sortation");
        System.out.println(Arrays.toString(WORDS));
        System.out.println("------------------");
    }
}
