package state.implementations;

import state.interfaces.State;

public class ConcreteStateB extends State {
    @Override
    public void handleTaskA() {
        System.out.println("ConcreteStateB:: handles Task A");
    }

    @Override
    public void handleTaskB() {
        System.out.println("ConcreteStateB:: handles Task B");
        System.out.println("ConcreteStateB:: want to change the state of Context.");
        this.context.transitionTo(new ConcreteStateA());
    }
}
