package state.interfaces;

import state.implementations.Context;

/**
 * The base State class declares methods that all Concrete State should
 * implement and also provides a backreference to the Context object, associated
 * with the State. This backreference can be used by States to transition the
 * Context to another State.
 */
public abstract_pattern class State {

    protected Context context;
    
    public void setContext(Context context) {
        this.context = context;
    }
    
    public abstract_pattern void handleTaskA();
    public abstract_pattern void handleTaskB();
}
