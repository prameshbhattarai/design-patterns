package org.design.pattern.behavioural.strategy.implementations;

import org.design.pattern.behavioural.strategy.interfaces.Strategy;

import java.util.Arrays;

/**
 * The Context defines the interface of interest to clients.
 */
public class Context {

    private static final String[] WORDS = new String[]{"a", "o", "u", "e", "i"};

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void startSorting() {
        System.out.println("------------------");
        System.out.printf("Context:: Start sorting using %s%n", this.strategy.getClass().getSimpleName());
        var sorted = this.strategy.sort(WORDS);

        System.out.println("Context:: After sorting");
        System.out.println(Arrays.toString(sorted));
        System.out.println("------------------");
    }
}
