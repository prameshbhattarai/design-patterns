package org.design.pattern.behavioural.strategy.implementations;

import org.design.pattern.behavioural.strategy.interfaces.Strategy;

import java.util.Arrays;

/**
 * This will sort the words in ASC order.
 */
public class ASCSortingStrategy implements Strategy {
    @Override
    public String[] sort(String[] words) {
        Arrays.sort(words);
        return words;
    }
}
