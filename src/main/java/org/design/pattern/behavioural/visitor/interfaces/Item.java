package org.design.pattern.behavioural.visitor.interfaces;

/**
 * The Order interface declares an `accept` method that should take the base
 * visitor interface as an argument.
 */
public interface Item {

    void accept(CalculatorVisitor calculatorVisitor);
}
