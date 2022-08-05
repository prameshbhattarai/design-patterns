package factory;

import factory.interfaces.Factory;
import factory.interfaces.Product;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final Factory factory;
    
    public Application(Factory factory) {
        this.factory = factory;
    }
    
    public String doAction() {
        String defaultFactoryAction = this.factory.defaultAction();
        System.out.println("------------------ Factory default action ------------------");
        System.out.println(defaultFactoryAction);
        System.out.println("---------------------------------------------------------------");
        
        Product product = this.factory.createProduct();
        return product.action();
    }
}
