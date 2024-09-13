package org.design.pattern.behavioural.template;

import org.design.pattern.behavioural.template.implementations.ConcreteClass1;
import org.design.pattern.behavioural.template.implementations.ConcreteClass2;
import org.design.pattern.behavioural.template.interfaces.BaseTemplate;

import java.util.function.Consumer;

/**
 * Template Method is a behavioral design pattern that allows you to defines a skeleton of an algorithm
 * in a base class and let subclasses override the steps without changing the overall algorithm’s structure.
 */
public class Client {

    public static void main(String... args) {
        Consumer<BaseTemplate> templateConsumer = BaseTemplate::templateMethod;

        // process ConcreteClass1
        System.out.println("Process ConcreteClass1");
        templateConsumer.accept(new ConcreteClass1());

        // process ConcreteClass2
        System.out.println("Process ConcreteClass2");
        templateConsumer.accept(new ConcreteClass2());
    }
}
