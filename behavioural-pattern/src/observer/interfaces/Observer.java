package observer.interfaces;

/**
 * The Observer interface declares the update method, used by subjects.
 */
public interface Observer {

    // Receive update from subject.
    void update(Subject subject);
}
