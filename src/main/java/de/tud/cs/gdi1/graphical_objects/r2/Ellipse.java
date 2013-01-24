package de.tud.cs.gdi1.graphical_objects.r2;

import java.awt.Graphics2D;

public class Ellipse extends ColorableFigure {

    private int width;
    private int height;

    private Point center;

    public Ellipse(Point center, int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
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

    @Override
    public void paint(Graphics2D g) {
        g.drawOval(center.getX() - width / 2, center.getY() - height / 2, width, height);

    }

}
