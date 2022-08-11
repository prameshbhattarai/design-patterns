package observer.implementations;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.*;

/**
 * The Subject owns some important state and notifies observers when the state
 * changes.
 */
public class ConcreteSubject implements Subject {

    // state of this subject
    private int state;
    
    private final Random random;

    // list of subscribers to this Subject
    // we will notify all subscribers listed here 
    private final List<Observer> observerList;
    
    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
        this.random = new Random();
    }

    @Override
    public void attach(Observer observer) {
        boolean isExist = observerList.contains(observer);
        if (isExist) {
            System.out.println("ConcreteSubject:: Observer already subscribing to this Subject \n");
            return;
        }
        System.out.println("ConcreteSubject:: Observer attach to this Subject \n");
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        boolean isExist = observerList.contains(observer);
        if (!isExist) {
            System.out.println("ConcreteSubject:: Observer does not exists \n");
            return;
        }
        System.out.println("ConcreteSubject:: Observer detach from this Subject \n");
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("ConcreteSubject:: Notify all the observers... \n");
        observerList.forEach(observer -> observer.update(this));
    }
    
    public void triggerSomeAction() {
        System.out.println("ConcreteSubject:: processing some task... \n");

        this.sleep(1000);
        this.state = random.nextInt(10) + 1;
        
        // notify all the subscribers/observers
        this.notifyObservers();
    }
    
    private void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getState() {
        return state;
    }
}
