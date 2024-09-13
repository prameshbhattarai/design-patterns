package org.design.pattern.behavioural.observer.interfaces;

/**
 * The Subscriber interface declares the subscribe method to subscribe Topic.
 */
public interface Subscriber {
    void listen(Topic topic);
}
