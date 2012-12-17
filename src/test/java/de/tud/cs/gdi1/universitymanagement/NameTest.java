package de.tud.cs.gdi1.universitymanagement;

import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void testIt() {
        Name name = new ChineseName("Li", "Wu");
        Assert.assertEquals(name.getFormOfAddress(), "Wu Li");
    }

}
