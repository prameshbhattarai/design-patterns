package org.design.pattern.behavioural.mediator;

import org.design.pattern.behavioural.mediator.implementations.Component1;
import org.design.pattern.behavioural.mediator.implementations.Component2;
import org.design.pattern.behavioural.mediator.implementations.ConcreteMediator;
import org.design.pattern.behavioural.mediator.interfaces.EventTypes;

/**
 * Mediator is a behavioral design pattern that reduces coupling between components of a program by
 * making them communicate indirectly, through a special mediator object.
 */
public class Client {

    public static void main(String... args) {
        var component1 = new Component1();
        var component2 = new Component2();

        var mediator = new ConcreteMediator(component1, component2);
        mediator.notify(EventTypes.COMPONENT_1_EVENT);

        System.out.println("------------------------");
        mediator.notify(EventTypes.COMPONENT_2_EVENT);
    }
}
