package org.design.pattern.behavioural.mediator.implementations;

import org.design.pattern.behavioural.mediator.interfaces.BaseComponent;
import org.design.pattern.behavioural.mediator.interfaces.EventTypes;

public class Component2 implements BaseComponent {

    public void doTaskFromMediator(EventTypes event) {
        System.out.printf("Component2:: doing task for event %s %n", event);
    }

    public void doAnotherTaskFromMediator(EventTypes event) {
        System.out.printf("Component2:: doing another for event %s %n", event);
    }
}
