package org.design.pattern.creational.factory;

import org.design.pattern.creational.factory.interfaces.Factory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final Factory factory;

    public Application(Factory factory) {
        this.factory = factory;
    }

    public String doAction() {
        var defaultFactoryAction = this.factory.defaultAction();
        System.out.println("------------------ Factory default action ------------------");
        System.out.println(defaultFactoryAction);
        System.out.println("---------------------------------------------------------------");

        var product = factory.createProduct();
        return product.action();
    }
}
