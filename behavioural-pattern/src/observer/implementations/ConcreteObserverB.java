package observer.implementations;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.Objects;

/**
 * This Observer only process if the Subject state is greater than 5.
 */
public class ConcreteObserverB implements Observer {
    
    private final String name = "ConcreteObserverB";

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject && ((ConcreteSubject) subject).getState() <= 5) {
            System.out.println("ConcreteObserverB:: Subject state is greater than 5, so I am processing it.... \n");
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteObserverB that = (ConcreteObserverB) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
