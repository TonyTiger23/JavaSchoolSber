package org.example;

public class Rect extends AbstractShape{
    protected double width;
    private double height;

    public Rect(String color, boolean filled, double width, double height)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", width: " + width + ", height: " + height;
    }
}
