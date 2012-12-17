package de.tud.cs.gdi1.squares_and_rectangles;

public class Rectangle {

    protected int width;

    protected int height;

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
