package visitor.implementations;

import visitor.interfaces.Visitor;

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcreteComponentA(ConcreteComponentA componentA) {
        System.out.println("ConcreteVisitor2:: invoke exclusive method of ComponentA.");
        componentA.exclusiveMethodOfComponentA();
    }

    @Override
    public void visitConcreteComponentB(ConcreteComponentB componentB) {
        System.out.println("ConcreteVisitor2:: invoke exclusive method of ComponentB.");
        componentB.exclusiveMethodOfComponentB();
    }
}
