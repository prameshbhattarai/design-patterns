package factory.implementations;

import factory.interfaces.Factory;
import factory.interfaces.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
