package org.design.pattern.behavioural.observer;

import org.design.pattern.behavioural.observer.implementations.ConcreteSubscriberA;
import org.design.pattern.behavioural.observer.implementations.ConcreteSubscriberB;
import org.design.pattern.behavioural.observer.implementations.ConcreteTopic;

/**
 * Observer is a behavioral design pattern that allows some objects to notify other objects about changes in their state.
 */
public class Client {

    public static void main(String... args) {
        var topic = new ConcreteTopic();

        var subscriberA = new ConcreteSubscriberA();
        var subscriberB = new ConcreteSubscriberB();

        // subscribe topic
        topic.attach(subscriberA);
        topic.attach(subscriberA); // already subscribed
        topic.attach(subscriberA); // already subscribed
        topic.attach(subscriberB);

        System.out.println("Trigger action in Subject....");
        topic.triggerSomeAction();
        topic.triggerSomeAction();

        System.out.println("Detach subscriberA from the Topic");
        topic.detach(subscriberA);

        System.out.println("Again Trigger action in Topic....");
        topic.triggerSomeAction();
        topic.triggerSomeAction();
    }
}
