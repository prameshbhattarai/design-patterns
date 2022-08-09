package iterator.implementations;

import iterator.interfaces.Iterator;

/**
 * Concrete Iterators implement various traversal algorithms. 
 * These classes store the current traversal position at all times.
 */
public class OrderIterator implements Iterator<String> {

    private final WordCollections collections;
    
    /**
     * Stores the current traversal position. An iterator may have a lot of
     * other fields for storing iteration state, especially when it is supposed
     * to work with a particular kind of collection.
     */
     private int position = 0;
     
     /**
     * This variable indicates the traversal direction.
     */
     private final boolean reverse;

    public OrderIterator(WordCollections collections, boolean reverse) {
        this.collections = collections;
        this.reverse = reverse;
        
        if (reverse) {
            this.position = collections.getCount() - 1;
        }
    }

    @Override
    public String current() {
        return this.collections.getItems().get(this.position);
    }

    @Override
    public String next() {
        String item = current();
        this.position += this.reverse ? -1 : 1;
        return item;
    }

    @Override
    public int key() {
        return this.position;
    }

    @Override
    public boolean valid() {
        if (this.reverse) {
            return this.position >= 0;
        }

        return this.position < this.collections.getCount();
    }

    @Override
    public void reset() {
        this.position = this.reverse ? this.collections.getCount() - 1 : 0;
    }
}
