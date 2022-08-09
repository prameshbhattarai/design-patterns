package mediator;

import mediator.implementations.Component1;
import mediator.implementations.Component2;
import mediator.implementations.ConcreteMediator;
import mediator.interfaces.EventTypes;
import mediator.interfaces.Mediator;

/**
 * Mediator is a behavioral design pattern that reduces coupling between components of a program by 
 * making them communicate indirectly, through a special mediator object.
 */
public class Client {

    public static void main(String... args) {
        Component1 component1 = new Component1();
        Component2 component2 = new Component2();

        Mediator mediator = new ConcreteMediator(component1, component2);
        mediator.notify(EventTypes.COMPONENT_1_EVENT);

        System.out.println("------------------------");
        mediator.notify(EventTypes.COMPONENT_2_EVENT);
    }
}
