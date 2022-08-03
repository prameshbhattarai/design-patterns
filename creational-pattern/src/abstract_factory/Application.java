package abstract_factory;

import abstract_factory.interfaces.AbstractFactory;
import abstract_factory.interfaces.AbstractProductA;
import abstract_factory.interfaces.AbstractProductB;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final AbstractProductA abstractProductA;
    private final AbstractProductB abstractProductB;
    
    public Application(AbstractFactory abstractFactory) {
        abstractProductA = abstractFactory.createProductA();
        abstractProductB = abstractFactory.createProductB();
    }
    
    public void doAction() {
        String action = abstractProductA.actionAFromProductA();
        System.out.println("Action A done from Product A ");
        System.out.println(action);
        System.out.println("-----------------");
        
        abstractProductA.actionBFromProductA();
        System.out.println("Action B done from Product A ");
        System.out.println(action);
        System.out.println("-----------------");
        
        abstractProductB.actionAFromProductB();
        System.out.println("Action A done from Product B ");
        System.out.println(action);
        System.out.println("-----------------");
        
        abstractProductB.actionAFromProductB();
        System.out.println("Action B done from Product B ");
        System.out.println(action);
        System.out.println("-----------------");
    }
}
