package org.design.pattern.behavioural.mediator.implementations;

import org.design.pattern.behavioural.mediator.interfaces.EventTypes;
import org.design.pattern.behavioural.mediator.interfaces.Mediator;

/**
 * Concrete Mediators implement cooperative behavior by coordinating several
 * components.
 */
public class ConcreteMediator implements Mediator {

    private final Component1 component1;
    private final Component2 component2;

    public ConcreteMediator(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    @Override
    public void notify(EventTypes event) {
        if (event.equals(EventTypes.COMPONENT_1_EVENT)) {
            System.out.printf("Mediator reacts on event :: %s and triggers following operations: %n", event);
            this.component1.doTaskFromMediator(event);
            this.component1.doAnotherTaskFromMediator(event);
        }

        if (event.equals(EventTypes.COMPONENT_2_EVENT)) {
            System.out.printf("Mediator reacts on event :: %s and triggers following operations: %n", event);
            this.component2.doTaskFromMediator(event);
            this.component2.doAnotherTaskFromMediator(event);
        }
    }
}
