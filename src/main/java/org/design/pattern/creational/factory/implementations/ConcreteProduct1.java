package org.design.pattern.creational.factory.implementations;

import org.design.pattern.creational.factory.interfaces.Product;

/**
 * Concrete Products provide various implementations of the Product interface.
 */
public class ConcreteProduct1 implements Product {
    @Override
    public String action() {
        return "Concrete Product 1: action from product 1.";
    }
}
