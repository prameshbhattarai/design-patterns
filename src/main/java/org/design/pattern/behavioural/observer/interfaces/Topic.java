package org.design.pattern.behavioural.observer.interfaces;

/**
 * The Topic interface declares a set of methods for managing subscribers.
 */
public interface Topic {

    // Attach a subscriber to the topic.
    void attach(Subscriber subscriber);

    // Detach a subscriber from the topic.
    void detach(Subscriber subscriber);
}
