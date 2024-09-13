package org.design.pattern.creational.factory.implementations;

import org.design.pattern.creational.factory.interfaces.Product;

public class ConcreteProduct2 implements Product {
    @Override
    public String action() {
        return "Concrete Product 2: action from product 2.";
    }
}
