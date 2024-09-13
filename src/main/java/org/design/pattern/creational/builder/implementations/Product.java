package org.design.pattern.creational.builder.implementations;

import java.util.ArrayList;
import java.util.List;

/**
 * It makes sense to use the Builder pattern only when your products are quite
 * complex and require extensive configuration.
 * <p>
 * Unlike in other creation patterns, different concrete builders can produce
 * unrelated products. In other words, results of various builders may not
 * always follow the same interface.
 */
public class Product {

    private final List<String> parts;

    public Product() {
        this.parts = new ArrayList<>();
    }

    public List<String> getParts() {
        return parts;
    }

    public void listParts() {
        String partJoin = parts.stream().reduce("",
                (partialString, partName) -> partialString.concat(" ").concat(partName));
        System.out.println("Product parts: " + partJoin);
    }

}
