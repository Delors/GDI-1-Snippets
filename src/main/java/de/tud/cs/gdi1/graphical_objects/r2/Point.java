package de.tud.cs.gdi1.graphical_objects.r2;

import java.awt.Graphics2D;

public class Point implements Figure {

    public static final Point ORIGIN = new Point(0, 0);

    private final int x;
    private final int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void paint(Graphics2D g) {
        // Nothing to do
    }

}
