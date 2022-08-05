package builder.implementations;

import java.util.ArrayList;
import java.util.List;

/**
 * It makes sense to use the Builder pattern only when your products are quite
 * complex and require extensive configuration.
 *
 * Unlike in other creational patterns, different concrete builders can produce
 * unrelated products. In other words, results of various builders may not
 * always follow the same interface.
 */
public class Product1 {

    private final List<String> parts;
    
    public Product1() {
        this.parts = new ArrayList<>();
    }

    public List<String> getParts() {
        return parts;
    }
    
    public void listParts() {
        String partJoin = parts.stream().reduce("", 
        (partialString, element) -> partialString.concat(" ").concat(element));
        System.out.println("Product 1 parts: " + partJoin);
    }
     
}
