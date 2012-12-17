package de.tud.cs.gdi1.graphical_objects;

import java.awt.Color;

public abstract class ColorableFigure implements Figure {

    private Color lineColor;

    private Color fillColor;

    public ColorableFigure(Color c) {
        this.lineColor = c;
    }

    public ColorableFigure() {
        this(Color.BLACK);
    }

    public void setLineColor(Color c) {
        lineColor = c;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setFillColor(Color c) {
        this.fillColor = c;
    }

    public Color getFillColor() {
        return fillColor;
    }

}
