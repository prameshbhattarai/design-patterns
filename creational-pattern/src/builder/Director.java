package builder;

import builder.interfaces.Builder;

/**
 * The Director is only responsible for executing the building steps in a
 * particular sequence. It is helpful when producing products according to a
 * specific order or configuration. Strictly speaking, the Director class is
 * optional, since the client can control builders directly.
 */
public class Director {
    
    private Builder builder;
    
    /**
     * The Director works with any builder instance that the client code passes
     * to it. This way, the client code may alter the final type of the newly
     * assembled product.
     */
    public void setBuilder(Builder builder) {
         this.builder = builder;
    }
    
    /**
     * The Director can construct several product variations using the same
     * building steps.
     */
    public void buildMinimalViableProduct() {
        this.builder.producePartA();
    }
    
    public void buildFullFeaturedProduct() {
        this.builder.producePartA();
        this.builder.producePartB();
        this.builder.producePartC();
    }
}
