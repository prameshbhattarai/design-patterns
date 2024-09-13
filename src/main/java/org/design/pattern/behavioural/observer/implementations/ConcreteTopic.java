package org.design.pattern.behavioural.observer.implementations;

import org.design.pattern.behavioural.observer.interfaces.Subscriber;
import org.design.pattern.behavioural.observer.interfaces.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Topic owns some important state and notifies observers when the state changes.
 */
public class ConcreteTopic implements Topic {

    private final Random random;

    // list of subscribers to this Topic, we will notify all subscribers listed here
    private final List<Subscriber> subscriberList;
    // state of this topic
    private int state;

    public ConcreteTopic() {
        this.subscriberList = new ArrayList<>();
        this.random = new Random();
    }

    @Override
    public void attach(Subscriber subscriber) {
        boolean isExist = subscriberList.contains(subscriber);
        if (isExist) {
            System.out.println("ConcreteTopic:: Subscriber already subscribing to this Topic \n");
            return;
        }
        System.out.println("ConcreteTopic:: Subscriber attach to this Topic \n");
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        boolean isExist = subscriberList.contains(subscriber);
        if (!isExist) {
            System.out.println("ConcreteTopic:: Subscriber does not exists \n");
            return;
        }
        System.out.println("ConcreteTopic:: Subscriber detach from this Subject \n");
        subscriberList.remove(subscriber);
    }

    public void triggerSomeAction() {
        System.out.println("ConcreteTopic:: processing some task... \n");

        this.sleep(1000);
        this.state = random.nextInt(10) + 1;

        // notify all the subscribers/observers
        this.notifySubscribers();
    }

    public int getState() {
        return state;
    }

    private void notifySubscribers() {
        System.out.println("ConcreteTopic:: Notify all the subscribers... \n");
        subscriberList.forEach(subscriber -> subscriber.listen(this));
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // ignore it
        }
    }
}
