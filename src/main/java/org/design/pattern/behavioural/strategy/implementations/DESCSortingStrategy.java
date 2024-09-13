package org.design.pattern.behavioural.strategy.implementations;

import org.design.pattern.behavioural.strategy.interfaces.Strategy;

import java.util.Arrays;
import java.util.Collections;

/**
 * This will sort the words in DESC order.
 */
public class DESCSortingStrategy implements Strategy {
    @Override
    public String[] sort(String[] words) {
        Arrays.sort(words, Collections.reverseOrder());
        return words;
    }
}
