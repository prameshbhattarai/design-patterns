package builder;

import builder.implementations.ConcreteBuilder1;

/**
 * The client code works with factories and products only through abstract
 * types: AbstractFactory and AbstractProduct. This lets you pass any factory or
 * product subclass to the client code without breaking it.
 */
public class Client {

    public static void main(String... args) {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        Director director = new Director();
        director.setBuilder(concreteBuilder1);

        System.out.println("-----------------------------");
        System.out.println("Standard basic product:");
        director.buildMinimalViableProduct();
        concreteBuilder1.getProduct1().listParts();
        
        System.out.println("-----------------------------");
        System.out.println("Standard full featured product:");
        director.buildFullFeaturedProduct();
        concreteBuilder1.getProduct1().listParts();
        
        System.out.println("-----------------------------");
        System.out.println("Custom product:");
        concreteBuilder1.producePartA();
        concreteBuilder1.producePartC();
        concreteBuilder1.getProduct1().listParts();
    
    }
}
