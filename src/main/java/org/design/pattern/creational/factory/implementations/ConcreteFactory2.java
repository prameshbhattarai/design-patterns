package org.design.pattern.creational.factory.implementations;

import org.design.pattern.creational.factory.interfaces.Factory;
import org.design.pattern.creational.factory.interfaces.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
