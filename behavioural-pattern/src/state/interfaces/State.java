package state.interfaces;

import state.implementations.Context;

/**
 * The base State class declares methods that all Concrete State should
 * implement and also provides a backreference to the Context object, associated
 * with the State. This backreference can be used by States to transition the
 * Context to another State.
 */
public abstract class State {

    protected Context context;
    
    public void setContext(Context context) {
        this.context = context;
    }
    
    public abstract void handleTaskA();
    public abstract void handleTaskB();
}
