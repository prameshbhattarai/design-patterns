package org.design.pattern.creational.factory;

import org.design.pattern.creational.factory.implementations.ConcreteFactory1;
import org.design.pattern.creational.factory.implementations.ConcreteFactory2;

public class Client {

    public static void main(String... args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ Concrete Factory 1 --------------------");

        var application = new Application(new ConcreteFactory1());
        var action = application.doAction();
        System.out.println(action);

        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ Concrete Factory 2 --------------------");

        application = new Application(new ConcreteFactory2());
        action = application.doAction();
        System.out.println(action);
    }
}
