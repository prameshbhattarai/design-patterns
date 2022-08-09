package iterator.interfaces;

/**
 * Iterator Design Pattern
 *
 * Intent: Lets you traverse elements of a collection without exposing its
 * underlying representation (list, stack, tree, etc.).
 */
public interface Iterator<T> {

    // Return the current element.
    T current();
    
    // Return the current element and move forward to next element.
    T next();
    
    // Return the key of the current element.
    int key();
    
    // Checks if current position is valid.
    boolean valid();
    
    // reset the Iterator to the first element.
    void reset();
}
