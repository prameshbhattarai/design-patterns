package visitor;

import visitor.implementations.ConcreteComponentA;
import visitor.implementations.ConcreteComponentB;
import visitor.implementations.ConcreteVisitor1;
import visitor.implementations.ConcreteVisitor2;
import visitor.interfaces.Component;
import visitor.interfaces.Visitor;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * Visitor is a behavioral design pattern that allows adding new behaviors to existing class 
 * hierarchy without altering any existing code.
 */
public class Client {

    public static void main(String... args) {
        BiConsumer<List<Component>, Visitor> processor = (listOfComponent, visitor) ->
          listOfComponent.forEach(component -> component.accept(visitor));  
        
        List<Component> components = List.of(new ConcreteComponentA(), new ConcreteComponentB());

        System.out.println("-----------------------------------");
        System.out.println("The client code works with all visitors via the base Visitor interface:");
        Visitor visitor1 = new ConcreteVisitor1();
        processor.accept(components, visitor1);
        System.out.println("-----------------------------------");

        System.out.println("-----------------------------------");
        System.out.println("It allows the same client code to work with different types of visitors:");
        Visitor visitor2 = new ConcreteVisitor2();
        processor.accept(components, visitor2);
        System.out.println("-----------------------------------");
    }
}
