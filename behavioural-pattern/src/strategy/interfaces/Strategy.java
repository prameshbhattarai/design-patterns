package strategy.interfaces;

/**
 * The Strategy interface declares common methods that will be in Concrete Strategies.
 *
 * The Context uses this interface to call the sort method defined in Concrete Strategies.
 */
public interface Strategy {
    void sort(String[] words);
}
