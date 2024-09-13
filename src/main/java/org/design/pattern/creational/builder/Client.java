package org.design.pattern.creational.builder;

import org.design.pattern.creational.builder.implementations.ConcreteBuilder;

/**
 * The client code works with factories and products only through abstract
 * types: AbstractFactory and AbstractProduct.
 * <p>
 * This lets you pass any factory or product subclass to the client code without breaking it.
 */
public class Client {

    public static void main(String... args) {
        var builder = new ConcreteBuilder();

        var director = new Director();
        director.setBuilder(builder);

        System.out.println("-----------------------------");
        System.out.println("Standard basic product:");
        director.buildMinimalViableProduct();
        builder.getProduct().listParts();

        System.out.println("-----------------------------");
        System.out.println("Standard full featured product:");
        director.buildFullFeaturedProduct();
        builder.getProduct().listParts();

        System.out.println("-----------------------------");
        System.out.println("Custom product:");
        builder.producePartB().producePartC();
        builder.getProduct().listParts();

    }
}
