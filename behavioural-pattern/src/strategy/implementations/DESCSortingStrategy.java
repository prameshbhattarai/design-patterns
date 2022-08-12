package strategy.implementations;

import strategy.interfaces.Strategy;

import java.util.Arrays;
import java.util.Collections;

/**
 * This will sort the words in DESC order.
 */
public class DESCSortingStrategy implements Strategy {
    @Override
    public void sort(String[] words) {
        Arrays.sort(words, Collections.reverseOrder());
    }
}
