package org.design.pattern.behavioural.visitor.implementations;

import org.design.pattern.behavioural.visitor.interfaces.CalculatorVisitor;
import org.design.pattern.behavioural.visitor.interfaces.Item;

/**
 * Each Concrete Component must implement the `accept` method in such a way that
 * it calls the visitor's method corresponding to the component's class.
 */
public record Mobile(String brand, double price, String version, double discount) implements Item {

    /**
     * Note that we're calling `visit`, which matches the current class name.
     * This way we let the visitor know the class of the component it works with.
     */
    @Override
    public void accept(CalculatorVisitor calculatorVisitor) {
        double price = calculatorVisitor.visit(this);
        System.out.printf("mobile price %f%n", price);
    }
}
