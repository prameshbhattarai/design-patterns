package observer.implementations;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.Objects;

/**
 * This Observer only process if the Subject state is less than or equal to 5.
 */
public class ConcreteObserverA implements Observer {

    private final String name = "ConcreteObserverA";
    
    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject && ((ConcreteSubject) subject).getState() <= 5) {
            System.out.println("ConcreteObserverA:: Subject state is less than 5, so I am processing it.... \n");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteObserverA that = (ConcreteObserverA) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
