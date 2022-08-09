package mediator.implementations;

import mediator.interfaces.BaseComponent;
import mediator.interfaces.EventTypes;

/**
 * Concrete Components implement various functionality. They don't depend on
 * other components. They also don't depend on any concrete mediator classes.
 */
public class Component1 implements BaseComponent {

    public void doTaskFromMediator(EventTypes event) {
        System.out.printf("Component1:: doing task for event %s %n", event);
    }

    public void doAnotherTaskFromMediator(EventTypes event) {
        System.out.printf("Component1:: doing another for event %s %n", event);
    }
}
