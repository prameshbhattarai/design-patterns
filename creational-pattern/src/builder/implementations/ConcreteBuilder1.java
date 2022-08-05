package builder.implementations;

import builder.interfaces.Builder;

/**
 * The Concrete Builder classes follow the Builder interface and provide
 * specific implementations of the building steps. Your program may have several
 * variations of Builders, implemented differently.
 */
public class ConcreteBuilder1 implements Builder {

    private Product1 product1;

    public ConcreteBuilder1() {
        this.reset();
    }

    @Override
    public void producePartA() {
        this.product1.getParts().add("PartA1");
    }

    @Override
    public void producePartB() {
        this.product1.getParts().add("PartB1");
    }

    @Override
    public void producePartC() {
        this.product1.getParts().add("PartC1");
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
    public Product1 getProduct1() {
        Product1 returnProduct = this.product1;
        this.reset();
        return returnProduct;
    }
    
    private void reset() {
        this.product1 = new Product1();
    }
}
