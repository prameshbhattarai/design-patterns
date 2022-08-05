package prototype.interfaces;

import java.util.Objects;

/**
 * The Shape class that has cloning ability. We'll see how the values of field
 * with different types will be cloned.
 */
public abstract class Shape {
    
    public int x;
    public int y;
    public String color;
    
    public Shape() {}
    
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    
    public abstract Shape clone();
    
    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        Shape shape = (Shape) object;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    } 
}
