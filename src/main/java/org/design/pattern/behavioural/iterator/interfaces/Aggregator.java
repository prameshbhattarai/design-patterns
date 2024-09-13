package org.design.pattern.behavioural.iterator.interfaces;

public interface Aggregator<T> {

    // Retrieve an external iterator.
    Iterator<T> getIterator();
}
