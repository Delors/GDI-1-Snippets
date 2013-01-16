package de.tud.cs.gdi1.classesobjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestCounter {

    Counter cMax;
    Counter cMin;
    Counter c0;

    @Before
    public void setUp() throws Exception {
        cMax = new Counter(Integer.MAX_VALUE);
        cMin = new Counter(Integer.MIN_VALUE);
        c0 = new Counter(0);
    }

    @Test
    public void testGetCurrentVal() {

        assertEquals(Integer.MAX_VALUE, cMax.getCurrentVal());
        assertEquals(Integer.MIN_VALUE, cMin.getCurrentVal());
        assertEquals(0, c0.getCurrentVal());
    }

    @Test
    public void testSetValue() {
        assertEquals(19191, cMax.setValue(19191));
        assertEquals(19191, cMin.setValue(19191));
        assertEquals(19191, c0.setValue(19191));
    }

    @Test
    public void testInc() {
        assertEquals(1, c0.inc());
        assertEquals(Integer.MIN_VALUE + 1, cMin.inc());

        // assertEquals(Integer.MAX_VALUE + 1, cMax.inc());
    }

    @Test
    public void testDec() {
        fail("Not yet implemented"); // TODO
    }

}
