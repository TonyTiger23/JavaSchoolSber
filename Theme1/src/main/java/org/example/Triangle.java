package org.example;

public class Triangle extends AbstractShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, boolean filled, double sideA, double sideB, double sideC) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * sideA * sideB * sideC);
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sides: " + sideA + ", " + sideB + ", " + sideC;
    }
}
