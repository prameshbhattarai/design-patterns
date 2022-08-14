package template.implementations;

import template.interfaces.BaseTemplate;

/**
 * Usually, concrete classes override only a fraction of base class' operations.
 */
public class ConcreteClass1 extends BaseTemplate {
    
    @Override
    public void requiredOperation1() {
        System.out.println("ConcreteClass1:: Doing required operation 1...");
    }

    @Override
    public void requiredOperation2() {
        System.out.println("ConcreteClass1:: Doing required operation 2...");
    }
}
