package org.example;

public abstract class AbstractShape implements Shape {
    protected String color;
    protected boolean filled;

    public AbstractShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String getDescription()
    {
        return "Shape with color: " + color + ", filled: " + filled;
    }
}
