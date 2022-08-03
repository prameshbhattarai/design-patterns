package abstract_factory.implementations;

import abstract_factory.interfaces.AbstractProductA;

public class ConcreteProductA implements AbstractProductA {

    @Override
    public String actionAFromProductA() {
        return "ConcreteProductA :: action A is completed";
    }

    @Override
    public String actionBFromProductA() {
        return "ConcreteProductA :: action B is completed";
    }
}
