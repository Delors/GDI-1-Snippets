package de.tud.cs.gdi1.graphical_objects.r2;


public class Square extends ColorableFigure {

    private double a;

    public Square(double length) {
        this.a = length;
    }

    public double getA() {
        return a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

}
