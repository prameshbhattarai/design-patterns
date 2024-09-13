package org.design.pattern.creational.prototype.implementations;

import org.design.pattern.creational.prototype.interfaces.Shape;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, String color) {
        super(x, y, color);
    }

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
