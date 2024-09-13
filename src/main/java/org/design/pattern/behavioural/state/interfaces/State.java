package org.design.pattern.behavioural.state.interfaces;

import org.design.pattern.behavioural.state.implementations.Context;

/**
 * The base State class declares methods that all Concrete State should
 * implement and also provides a back reference to the Context object associated with the State.
 * <p>
 * This back reference can be used by States to transition the Context to another State.
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handleTaskA();

    public abstract void handleTaskB();
}
