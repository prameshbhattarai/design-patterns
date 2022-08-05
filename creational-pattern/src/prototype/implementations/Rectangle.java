package prototype.implementations;

import prototype.interfaces.Shape;

public class Rectangle extends Shape {

    public Rectangle() {}
    
    public Rectangle(Rectangle target) {
        super(target);
    }
    
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
