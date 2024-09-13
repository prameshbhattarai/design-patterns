package org.design.pattern.creational.builder.interfaces;

/**
 * The Builder interface specifies methods for creating the different parts of
 * the Product objects.
 */
public interface Builder {
    Builder producePartA();

    Builder producePartB();

    Builder producePartC();
}
