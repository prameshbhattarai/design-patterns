package org.design.pattern.behavioural.iterator.implementations;

import org.design.pattern.behavioural.iterator.interfaces.Aggregator;
import org.design.pattern.behavioural.iterator.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Collections provide one or several methods for retrieving fresh
 * iterator instances, compatible with the collection class.
 */
public class WordCollections implements Aggregator<String> {

    private final ArrayList<String> items = new ArrayList<>();

    @Override
    public Iterator<String> getIterator() {
        return new OrderIterator(this, false);
    }

    public int getCount() {
        return items.size();
    }

    public List<String> getItems() {
        // everytime getItems is called we are returning new arraylist
        // this might increase heap size
        return (List<String>) this.items.clone();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public Iterator<String> getReverseIterator() {
        return new OrderIterator(this, true);
    }
}
