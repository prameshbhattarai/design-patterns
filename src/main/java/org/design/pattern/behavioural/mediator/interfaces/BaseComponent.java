package org.design.pattern.behavioural.mediator.interfaces;

public interface BaseComponent {

    void doTaskFromMediator(EventTypes eventTypes);

    void doAnotherTaskFromMediator(EventTypes eventTypes);
}
