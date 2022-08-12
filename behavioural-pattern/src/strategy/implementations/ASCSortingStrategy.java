package strategy.implementations;

import strategy.interfaces.Strategy;

import java.util.Arrays;

/**
 * This will sort the words in ASC order.
 */
public class ASCSortingStrategy implements Strategy {
    @Override
    public void sort(String[] words) {
        Arrays.sort(words);
    }
}
