package visitor.implementations;

import visitor.interfaces.Component;
import visitor.interfaces.Visitor;

public class ConcreteComponentB implements Component {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteComponentB(this);
    }
    
    // it is not defined in Component interface
    public void exclusiveMethodOfComponentB() {
        System.out.println("ConcreteComponentB:: exclusive method from ComponentB");
    }
}
