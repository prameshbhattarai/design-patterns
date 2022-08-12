package state;

import state.implementations.ConcreteStateA;
import state.implementations.Context;

/**
 * State is a behavioral design pattern that allows an object to change the behavior when its internal state changes.
 */
public class Client {

    public static void main(String... args) {
        ConcreteStateA stateA = new ConcreteStateA();
        
        Context context = new Context(stateA);
        context.processTaskA();
        System.out.printf("Current state in Context :: %s%n", context.getCurrentState());

        context.processTaskB();
        System.out.printf("Current state after transition in Context :: %s%n", context.getCurrentState());
    }
}
