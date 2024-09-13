package org.design.pattern.behavioural.template.interfaces;

/**
 * The Abstract Class defines a template method that contains a skeleton of some
 * algorithm, composed of calls to (usually) abstract_pattern primitive operations.
 * <p>
 * Concrete subclasses should implement these operations, but leave the template
 * method itself intact.
 */
public abstract class BaseTemplate {

    public void templateMethod() {
        this.baseOperation1();
        this.baseOperation2();

        this.requiredOperation1();
        this.requiredOperation2();

        this.hookOperation1();
        this.hookOperation2();
    }

    // default methods... which contain default operations
    // which can also be override by the sub-class.. 
    public void baseOperation1() {
        System.out.println("BaseTemplate:: Doing baseOperation1");
    }

    public void baseOperation2() {
        System.out.println("BaseTemplate:: Doing baseOperation2");
    }

    // abstract_pattern methods.. only the method signature is defined in the BaseTemplate
    public abstract void requiredOperation1();

    public abstract void requiredOperation2();

    // methods that are not required.. but only defined in the base template
    // with empty implementation..
    // this types of methods are called hooks
    public void hookOperation1() {
    }

    public void hookOperation2() {
    }
}
