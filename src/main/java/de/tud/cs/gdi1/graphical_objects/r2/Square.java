package de.tud.cs.gdi1.graphical_objects.r2;

import java.awt.Graphics2D;

public class Square extends ColorableFigure {

    private int length;

    private Point upperLeftCorner;

    public Square(Point upperLeftCorner, int length) {
        this.length = length;
        this.upperLeftCorner = upperLeftCorner;
    }

    public Point getUpperLeftCorner() {
        return upperLeftCorner;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void paint(Graphics2D g) {
        g.drawRect(upperLeftCorner.getX(), upperLeftCorner.getY(), length, length);
    }
}
