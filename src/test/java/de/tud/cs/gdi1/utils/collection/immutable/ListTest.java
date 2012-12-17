package de.tud.cs.gdi1.utils.collection.immutable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings(value = { "rawtypes", "unchecked" })
public class ListTest {

    public int i;

    @Test(expected = IllegalArgumentException.class)
    public void testForNullValueError() {
        @SuppressWarnings("unused")
        List l = new List(null);
    }

    @Test
    public void testAdd() {
        List l = new List("2nd");
        Object first = "1st";
        List l2 = new List(first, l); // prepend an element
        assertEquals(first, l2.getValue());
    }

    @Test
    public void testToString() {
        List l = new List("Test");
        assertEquals("Test", l.toString());
    }
}
