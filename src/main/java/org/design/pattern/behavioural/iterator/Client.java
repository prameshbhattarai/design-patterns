package org.design.pattern.behavioural.iterator;

import org.design.pattern.behavioural.iterator.implementations.WordCollections;

/**
 * Iterator is a behavioral design pattern that allows sequential traversal through a complex data structure
 * without exposing its internal details.
 * <p>
 * The client code may or may not know about the Concrete Iterator or Collection
 * classes, depending on the level of indirection you want to keep in your
 * program.
 */
public class Client {

    public static void main(String... args) {
        var wordCollections = new WordCollections();
        wordCollections.addItem("first");
        wordCollections.addItem("second");
        wordCollections.addItem("third");

        System.out.println("Straight traversal... ");
        var iterator = wordCollections.getIterator();
        while (iterator.valid()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        System.out.println("Reverse traversal...");
        var reverseIterator = wordCollections.getReverseIterator();
        while (reverseIterator.valid()) {
            System.out.println(reverseIterator.next());
        }
    }
}
