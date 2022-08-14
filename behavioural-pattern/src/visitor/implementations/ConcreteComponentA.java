package visitor.implementations;

import visitor.interfaces.Component;
import visitor.interfaces.Visitor;

/**
 * Each Concrete Component must implement the `accept` method in such a way that
 * it calls the visitor's method corresponding to the component's class.
 */
public class ConcreteComponentA implements Component {
    
    /**
     * Note that we're calling `visitConcreteComponentA`, which matches the
     * current class name. This way we let the visitor know the class of the
     * component it works with.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteComponentA(this);
    }
    
    // it is not defined in Component interface
    public void exclusiveMethodOfComponentA() {
        System.out.println("ConcreteComponentA:: exclusive method from ComponentA");
    }
}
