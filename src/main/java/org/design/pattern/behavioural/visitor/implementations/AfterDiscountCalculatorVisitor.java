package org.design.pattern.behavioural.visitor.implementations;

import org.design.pattern.behavioural.visitor.interfaces.CalculatorVisitor;

public class AfterDiscountCalculatorVisitor implements CalculatorVisitor {
    @Override
    public double visit(Book book) {
        return book.price() - book.discount() * 100;
    }

    @Override
    public double visit(Mobile mobile) {
        return mobile.price() - mobile.discount() * 100;
    }

    @Override
    public double visit(Toys toys) {
        return toys.price() - toys.discount() * 100;
    }
}
