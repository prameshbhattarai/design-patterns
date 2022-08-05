package prototype.implementations;

import prototype.interfaces.Shape;

public class Circle extends Shape {

    public int radius;
    
    public Circle() {}
    
    public Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle circle = (Circle) object;
        return circle.radius != this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
