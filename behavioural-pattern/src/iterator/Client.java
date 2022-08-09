package iterator;

import iterator.implementations.WordCollections;
import iterator.interfaces.Iterator;

/**
 * The client code may or may not know about the Concrete Iterator or Collection
 * classes, depending on the level of indirection you want to keep in your
 * program.
 */
public class Client {

    public static void main(String... args) {
        WordCollections wordCollections = new WordCollections();
        wordCollections.addItem("first");
        wordCollections.addItem("second");
        wordCollections.addItem("third");

        System.out.println("Straight traversal... ");
        Iterator<String> iterator = wordCollections.getIterator();
        while (iterator.valid()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        System.out.println("Reverse traversal...");
        Iterator<String> reverseIterator = wordCollections.getReverseIterator();
        while (reverseIterator.valid()) {
            System.out.println(reverseIterator.next());
        }
    }
}
