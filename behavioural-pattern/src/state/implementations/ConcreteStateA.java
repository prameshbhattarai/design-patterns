package state.implementations;

import state.interfaces.State;

/**
 * Concrete States implement various behaviors, associated with a state of the
 * Context.
 */
public class ConcreteStateA extends State {

    @Override
    public void handleTaskA() {
        System.out.println("ConcreteStateA:: handles Task A");
    }

    @Override
    public void handleTaskB() {
        System.out.println("ConcreteStateA:: handles Task B");
        System.out.println("ConcreteStateA:: want to change the state of Context.");
        this.context.transitionTo(new ConcreteStateB());
    }
}
