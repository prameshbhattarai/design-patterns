package abstract_factory;

import abstract_factory.implementations.ConcreteFactory1;
import abstract_factory.implementations.ConcreteFactory2;
import abstract_factory.interfaces.AbstractFactory;

/**
 * The client code works with factories and products only through abstract
 * types: AbstractFactory and AbstractProduct. This lets you pass any factory or
 * product subclass to the client code without breaking it.
 */
public class Client {

    private enum FACTORY {FACTORY_1, FACTORY_2}
    
    private static Application configure(FACTORY factoryType) {
        AbstractFactory abstractFactory;
        return switch (factoryType) {
            case FACTORY_1:
            abstractFactory = new ConcreteFactory1();
            yield new Application(abstractFactory);
            
            case FACTORY_2:
            abstractFactory = new ConcreteFactory2();
            yield new Application(abstractFactory);
        };
    }
    
    public static void main(String... args) {
        System.out.println("------------- FACTORY_1 -------------");
        Application app = configure(FACTORY.FACTORY_1);
        app.doAction();

        System.out.println("------------- FACTORY_2 -------------");
        app = configure(FACTORY.FACTORY_2);
        app.doAction();
    }
}
