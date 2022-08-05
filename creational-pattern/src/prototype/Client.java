package prototype;

import prototype.implementations.Circle;
import prototype.implementations.Rectangle;
import prototype.interfaces.Shape;


/**
 * Prototype is a creational design pattern that allows cloning objects, even complex ones, 
 * without coupling to their specific classes.
 */
public class Client {

    public static void main(String... args) {
        Shape circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.color = "Red";

        System.out.println("---------- Circle ----------");
        System.out.println(circle);
        
        System.out.println("---------- Cloned Circle (prototype) ----------");
        Shape clonedCircle = circle.clone();
        System.out.println(clonedCircle);
        
        
        Shape rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 7;
        rectangle.color = "Green";

        System.out.println("--------- Rectangle ----------");
        System.out.println(rectangle);
        
        System.out.println("---------- Cloned Rectangle (prototype) ----------");
        Shape clonedRectangle = rectangle.clone();
        System.out.println(clonedRectangle);
    }
}
