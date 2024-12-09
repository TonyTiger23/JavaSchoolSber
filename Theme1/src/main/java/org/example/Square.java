package org.example;

public class Square extends Rect {

    public Square(String color, boolean filled, double side)
    {
        super(color, filled, side, side);
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + ", side" + width;
    }
}
