package de.tud.cs.gdi1.squares_and_rectangles;

// THIS IS A COUNTER-EXAMPLE; THIS IS A MISUSE OF INHERITANCE 
public class Square extends Rectangle {

    public Square(int radius) {
        super(radius, radius);
    }

    @Override
    public void setHeight(int height) {
        // LOOKS STRANGE AND VIOLATES THE (IMPLICIT) CONTRACT OF THE SUPER-CLASS' METHOD
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        // LOOKS STRANGE AND VIOLATES THE (IMPLICIT) CONTRACT OF THE SUPER-CLASS' METHOD
        super.setHeight(width);
        super.setWidth(width);
    }

}
