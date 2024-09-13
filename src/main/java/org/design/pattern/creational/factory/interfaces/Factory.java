package org.design.pattern.creational.factory.interfaces;

/**
 * The Creator class declares the factory method that is supposed to return an
 * object of a Product class. The Creator's subclasses usually provide the
 * implementation of this method.
 */
public abstract class Factory {

    public abstract Product createProduct();

    /**
     * This default action is applied to all the factories and can be overridden.
     */
    public String defaultAction() {
        return "Abstract Factory: default action from Factory.";
    }
}
