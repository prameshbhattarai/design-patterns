package observer.interfaces;

/**
 * The Subject interface declares a set of methods for managing subscribers.
 */
public interface Subject {

    // Attach an observer to the subject.
    void attach(Observer observer);

    // Detach an observer from the subject.
    void detach(Observer observer);

    // Notify all observers about an event.
    void notifyObservers();
}
