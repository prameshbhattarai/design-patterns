package org.design.pattern.behavioural.visitor.implementations;

import org.design.pattern.behavioural.visitor.interfaces.CalculatorVisitor;

/**
 * Concrete Visitors implement several versions of the same algorithm, which can
 * work with all concrete component classes.
 * <p>
 * You can experience the biggest benefit of the Visitor pattern when using it
 * with a complex object structure, such as a Composite tree.
 * <p>
 * In this case, it
 * might be helpful to store some intermediate state of the algorithm while
 * executing visitor's methods over various objects of the structure.
 */
public class PriceCalculatorCalculatorVisitor implements CalculatorVisitor {

    @Override
    public double visit(Book book) {
        return book.price();
    }

    @Override
    public double visit(Mobile mobile) {
        return mobile.price();
    }

    @Override
    public double visit(Toys toys) {
        return toys.price();
    }
}
