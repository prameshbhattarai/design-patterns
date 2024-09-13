package org.design.pattern.behavioural.mediator.implementations;

import org.design.pattern.behavioural.mediator.interfaces.BaseComponent;
import org.design.pattern.behavioural.mediator.interfaces.EventTypes;

/**
 * Concrete Components implement various functionality. They don't depend on
 * other components. They also don't depend on any concrete mediator classes.
 */
public class Component1 implements BaseComponent {

    @Override
    public void doTaskFromMediator(EventTypes event) {
        System.out.printf("Component1:: doing task for event %s %n", event);
    }

    @Override
    public void doAnotherTaskFromMediator(EventTypes event) {
        System.out.printf("Component1:: doing another for event %s %n", event);
    }
}
