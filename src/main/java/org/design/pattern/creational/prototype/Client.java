package org.design.pattern.creational.prototype;

import org.design.pattern.creational.prototype.implementations.Circle;
import org.design.pattern.creational.prototype.implementations.Rectangle;

/**
 * Prototype is a creation design pattern that allows cloning objects,
 * even complex ones, without coupling to their specific classes.
 */
public class Client {

    public static void main(String... args) {
        var circle = new Circle(10, 20, 5, "Red");
        System.out.println("---------- Circle ----------");
        System.out.println(circle);

        System.out.println("---------- Cloned Circle (prototype) ----------");
        var clonedCircle = circle.clone();
        System.out.println(clonedCircle);


        var rectangle = new Rectangle(5, 7, "Green");
        System.out.println("--------- Rectangle ----------");
        System.out.println(rectangle);

        System.out.println("---------- Cloned Rectangle (prototype) ----------");
        var clonedRectangle = rectangle.clone();
        System.out.println(clonedRectangle);
    }
}
