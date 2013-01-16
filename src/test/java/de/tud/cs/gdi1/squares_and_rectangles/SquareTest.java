package de.tud.cs.gdi1.squares_and_rectangles;

import org.junit.Assert;

public class SquareTest {

    // The following test will fail and by that demonstrates that it is not
    // sufficient that two classes A and B that are in "A is-a B" relation
    // - with respect to the target domain - actually inherit from each other.

    @org.junit.Test
    public void main() {
        // In the following imagine that we actually don't know that
        // the runtime type of the object that is referred to by "rect"
        // is "Square".
        Rectangle rect = new Square(100);

        rect.setHeight(200);
        rect.setWidth(50);
        Assert.assertEquals(50, rect.getWidth());
        Assert.assertEquals(200, rect.getHeight());
    }

}
