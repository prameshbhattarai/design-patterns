package org.design.pattern.creational.prototype.interfaces;

import java.util.Objects;

/**
 * The Shape class that has cloning ability.
 * We'll see how the values of field with different types will be cloned.
 */
public abstract class Shape implements Cloneable {
    protected int x;
    protected int y;
    protected String color;

    protected Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    protected Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Shape shape = (Shape) object;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
