package de.tud.cs.gdi1.graphical_objects;

public class Ellipse extends ColorableFigure {

    private int width;
    private int height;

    public Ellipse(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        // Left as a non-trivial exercise.
        throw new Error("Not yet implemented."); // TODO Implement getPerimeter().
    }

    @Override
    public double getArea() {
        return Math.PI * getHeight() * getWidth();
    }

}
