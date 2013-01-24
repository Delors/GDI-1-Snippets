package de.tud.cs.gdi1.graphical_objects.r2;

import java.awt.Graphics2D;

public class Circle extends ColorableFigure {

    private int r;

    private Point center;

    public Circle(Point center, int radius) {
        this.r = radius;
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int radius) {
        this.r = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {

        return Math.PI * r * r;
    }

    @Override
    public void paint(Graphics2D g) {
        g.drawOval(center.getX(), center.getY(), r, r);
    }
}
