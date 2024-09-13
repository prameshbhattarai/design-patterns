package org.design.pattern.creational.builder.implementations;


import org.design.pattern.creational.builder.interfaces.Builder;

/**
 * The Concrete Builder classes follow the Builder interface and provide
 * specific implementations of the building steps. Your program may have several
 * variations of Builders, implemented differently.
 */
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        reset();
    }

    @Override
    public ConcreteBuilder producePartA() {
        product.getParts().add("Part A");
        return this;
    }

    @Override
    public ConcreteBuilder producePartB() {
        product.getParts().add("Part B");
        return this;
    }

    @Override
    public ConcreteBuilder producePartC() {
        product.getParts().add("Part C");
        return this;
    }

    /**
     * Concrete Builders are supposed to provide their own methods for
     * retrieving results. That's because various types of builders may create
     * entirely different products that don't follow the same interface.
     * Therefore, such methods cannot be declared in the base Builder interface
     * (at least in a statically typed programming language).
     * <p>
     * Usually, after returning the end result to the client, a builder instance
     * is expected to be ready to start producing another product. That's why
     * it's a usual practice to call the reset method at the end of the
     * `getProduct` method body. However, this behavior is not mandatory, and
     * you can make your builders wait for an explicit reset call from the
     * client code before disposing of the previous result.
     */
    public Product getProduct() {
        var clone = this.product;
        reset();
        return clone;
    }

    private void reset() {
        this.product = new Product();
    }
}
