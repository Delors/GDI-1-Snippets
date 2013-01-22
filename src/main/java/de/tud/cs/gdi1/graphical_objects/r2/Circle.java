package de.tud.cs.gdi1.graphical_objects.r2;

public class Circle extends ColorableFigure {

    private int r;

    public Circle(int radius) {
        this.r = radius;
    }

    public int getR() {
        return r;
    }

    public void setR(int radius) {
        this.r = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {

        return Math.PI * r * r;
    }
}
