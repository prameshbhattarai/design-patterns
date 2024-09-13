package org.design.pattern.creational.abstract_factory.implementations;

import org.design.pattern.creational.abstract_factory.interfaces.AbstractFactory;
import org.design.pattern.creational.abstract_factory.interfaces.AbstractProductA;
import org.design.pattern.creational.abstract_factory.interfaces.AbstractProductB;

/**
 * Concrete Factories produce a family of products that belong to a single
 * variant. The factory guarantees that resulting products are compatible. Note
 * that signatures of the Concrete Factory's methods return an abstract product,
 * while inside the method a concrete product is instantiated.
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        System.out.println("Concrete Factory 1 :: Product A created");
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("Concrete Factory 1 :: Product B created");
        return new ConcreteProductB();
    }
}
