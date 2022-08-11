package observer;

import observer.implementations.ConcreteObserverA;
import observer.implementations.ConcreteObserverB;
import observer.implementations.ConcreteSubject;
import observer.interfaces.Observer;

/**
 * Observer is a behavioral design pattern that allows some objects to notify other objects about changes in their state.
 */
public class Client {

    public static void main(String... args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        
        // subscribe subject
        subject.attach(observerA);
        subject.attach(observerA); // already attached
        subject.attach(observerA); // already attached
        subject.attach(observerB);

        System.out.println("Trigger action in Subject....");
        subject.triggerSomeAction();
        subject.triggerSomeAction();

        System.out.println("Detach observerB from the Subject");
        subject.detach(observerA);
        
        System.out.println("Again Trigger action in Subject....");
        subject.triggerSomeAction();
        subject.triggerSomeAction();
    }
}
