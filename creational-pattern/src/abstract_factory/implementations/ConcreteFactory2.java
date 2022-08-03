package abstract_factory.implementations;

import abstract_factory.interfaces.AbstractFactory;
import abstract_factory.interfaces.AbstractProductA;
import abstract_factory.interfaces.AbstractProductB;

/**
 * Each Concrete Factory has a corresponding product variant.
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        System.out.println("Concrete Factory 2 :: Product A created");
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("Concrete Factory 2 :: Product B created");
        return new ConcreteProductB();
    }
}
