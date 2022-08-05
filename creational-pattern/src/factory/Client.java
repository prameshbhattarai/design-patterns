package factory;

import factory.implementations.ConcreteFactory1;
import factory.implementations.ConcreteFactory2;

public class Client {

    public static void main(String... args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ Concrete Factory 1 --------------------");
        Application application = new Application(new ConcreteFactory1());
        String action = application.doAction();
        System.out.println(action);

        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ Concrete Factory 2 --------------------");
        application = new Application(new ConcreteFactory2());
        action = application.doAction();
        System.out.println(action);
    }
}
