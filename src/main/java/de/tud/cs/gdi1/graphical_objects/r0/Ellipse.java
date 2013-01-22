package de.tud.cs.gdi1.graphical_objects.r0;

public class Ellipse extends Figure {

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

}
