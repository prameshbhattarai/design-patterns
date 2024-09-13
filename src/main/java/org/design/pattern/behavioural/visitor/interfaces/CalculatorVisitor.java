package org.design.pattern.behavioural.visitor.interfaces;

import org.design.pattern.behavioural.visitor.implementations.Book;
import org.design.pattern.behavioural.visitor.implementations.Mobile;
import org.design.pattern.behavioural.visitor.implementations.Toys;

/**
 * The Visitor Interface declares a set of visiting methods that correspond to component classes.
 * <p>
 * The signature of a visiting method allows the visitor to
 * identify the exact class of the component that it's dealing with.
 */
public interface CalculatorVisitor {
    double visit(Book book);

    double visit(Mobile mobile);

    double visit(Toys toys);
}
