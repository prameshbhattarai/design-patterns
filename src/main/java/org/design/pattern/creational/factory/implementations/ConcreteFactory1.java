package org.design.pattern.creational.factory.implementations;

import org.design.pattern.creational.factory.interfaces.Factory;
import org.design.pattern.creational.factory.interfaces.Product;

/**
 * Concrete Creators override the factory method in order to change the
 * resulting product's type.
 */
public class ConcreteFactory1 extends Factory {

    /**
     * Note that the signature of the method still uses the abstract product
     * type, even though the concrete product is actually returned from the
     * method. This way the Creator can stay independent of concrete product
     * classes.
     */
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
