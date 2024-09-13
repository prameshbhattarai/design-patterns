package org.design.pattern.creational.abstract_factory.interfaces;

/**
 * Each distinct product of a product family should have a base interface. All
 * variants of the product must implement this interface.
 */
public interface AbstractProductA {
    String actionAFromProductA();

    String actionBFromProductA();
}
