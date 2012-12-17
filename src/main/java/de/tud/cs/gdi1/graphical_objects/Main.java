package de.tud.cs.gdi1.graphical_objects;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        ColorableFigure circle = new Circle(100);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle.getLineColor());

        ColorableFigure square = new Square(12);
        square.setLineColor(Color.black);
        square.setFillColor(Color.black);

        System.out.println("Perimeter: " + square.getPerimeter());

    }

}
