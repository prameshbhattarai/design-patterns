package org.design.pattern.creational.abstract_factory.implementations;

import org.design.pattern.creational.abstract_factory.interfaces.AbstractProductB;

public class ConcreteProductB implements AbstractProductB {

    @Override
    public String actionAFromProductB() {
        return "ConcreteProductB :: action A is completed";
    }

    @Override
    public String actionBFromProductB() {
        return "ConcreteProductB :: action B is completed";
    }
}
