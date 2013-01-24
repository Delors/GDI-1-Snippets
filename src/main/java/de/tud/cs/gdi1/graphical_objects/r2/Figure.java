package de.tud.cs.gdi1.graphical_objects.r2;

import java.awt.Graphics2D;

public interface Figure {

    void paint(Graphics2D g);
    
    double getPerimeter(); // dt. Länge des Umfangs

    double getArea(); // dt. Fläche

}
