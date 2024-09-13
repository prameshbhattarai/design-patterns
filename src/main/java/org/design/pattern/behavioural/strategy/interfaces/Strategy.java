package org.design.pattern.behavioural.strategy.interfaces;

/**
 * The Strategy interface declares common methods that will be in Concrete Strategies.
 * <p>
 * The Context uses this interface to call the sort method defined in Concrete Strategies.
 */
public interface Strategy {
    String[] sort(String[] words);
}
