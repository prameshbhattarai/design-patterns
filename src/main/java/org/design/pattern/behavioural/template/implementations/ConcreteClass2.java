package org.design.pattern.behavioural.template.implementations;

import org.design.pattern.behavioural.template.interfaces.BaseTemplate;

public class ConcreteClass2 extends BaseTemplate {

    @Override
    public void requiredOperation1() {
        System.out.println("ConcreteClass2:: Doing required operation 1...");
    }

    @Override
    public void requiredOperation2() {
        System.out.println("ConcreteClass2:: Doing required operation 2...");
    }

    // this class is using the hook methods also
    @Override
    public void hookOperation1() {
        System.out.println("ConcreteClass2:: Overridden hook method from ConcreteClass2...");
    }
}
