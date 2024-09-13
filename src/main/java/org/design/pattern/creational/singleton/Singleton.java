package org.design.pattern.creational.singleton;

/**
 * Singleton is a creation design pattern, which ensures that only one object of its kind exists
 * and provides a single point of access to it for any other code.
 */
public class Singleton {

    private static Singleton instance;
    private final String value;

    /**
     * The Singleton's constructor should always be private to prevent direct
     * construction calls with the `new` operator.
     */
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
