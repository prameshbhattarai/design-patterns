package org.design.pattern.behavioural.visitor;

import org.design.pattern.behavioural.visitor.implementations.*;
import org.design.pattern.behavioural.visitor.interfaces.CalculatorVisitor;
import org.design.pattern.behavioural.visitor.interfaces.Item;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * Visitor is a behavioral design pattern that allows adding new behaviors to existing class
 * hierarchy without altering any existing code.
 */
public class Client {

    public static void main(String... args) {
        List<Item> items = List.of(
                new Book("Java Book", 10.17, "1st edition", 0.2),
                new Toys("Lego", 8.91, "Latest edition", 0.3),
                new Mobile("Doro", 4, "6881", 0)
        );

        BiConsumer<List<Item>, CalculatorVisitor> calculateTotalPrice =
                (listOfItems, calculator) ->
                        listOfItems.forEach(
                                item -> item.accept(calculator)
                        );

        System.out.println("-----------------------------------");
        System.out.println("The client code works with all visitors via the base Visitor interface:");
        var priceCalculator = new PriceCalculatorCalculatorVisitor();
        calculateTotalPrice.accept(items, priceCalculator);
        System.out.println("-----------------------------------");

        System.out.println("-----------------------------------");
        System.out.println("It allows the same client code to work with different types of visitors:");
        var visitor2 = new AfterDiscountCalculatorVisitor();
        calculateTotalPrice.accept(items, visitor2);
        System.out.println("-----------------------------------");
    }
}
