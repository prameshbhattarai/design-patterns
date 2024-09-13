package org.design.pattern.behavioural.observer.implementations;

import org.design.pattern.behavioural.observer.interfaces.Subscriber;
import org.design.pattern.behavioural.observer.interfaces.Topic;

import java.util.Objects;

/**
 * This Subscriber only process if the Topic state is less than or equal to 5.
 */
public class ConcreteSubscriberA implements Subscriber {

    private static final String name = "ConcreteSubscriberA";

    @Override
    public void listen(Topic topic) {
        if (topic instanceof ConcreteTopic && ((ConcreteTopic) topic).getState() <= 5) {
            System.out.println("ConcreteSubscriberA:: Topic state is less than 5, so I am processing it.... \n");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o != null && getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
