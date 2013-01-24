package de.tud.cs.gdi1.graphical_objects.r1;

import static java.lang.System.out;

public class Circle extends Figure {

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

    public static void main(String[] args) {
        // Figure f = new Figure(); // Das Instanziieren einer abstrakten Klasse ist nicht möglich
        Figure f = new Circle(222);
        out.println(f.getPerimeter());
    }
}
