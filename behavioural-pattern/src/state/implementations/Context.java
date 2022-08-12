package state.implementations;

import state.interfaces.State;

/**
 * The Context defines the interface of interest to clients. It also maintains a
 * reference to an instance of a State subclass, which represents the current
 * state of the Context.
 */
public class Context {

    // A reference to the current state of the Context.
    private State state;
    
    public Context(State state) {
        this.transitionTo(state);
    }
    
    public String getCurrentState() {
        return this.state.getClass().getSimpleName();
    }
    
    public void transitionTo(State state) {
        System.out.printf("Context:: Transition to %s%n", state.getClass().getSimpleName());
        this.state = state;
        this.state.setContext(this);
    }
    
    public void processTaskA() {
        this.state.handleTaskA();
    }
    
    public void processTaskB() {
        this.state.handleTaskB();
    }
}
