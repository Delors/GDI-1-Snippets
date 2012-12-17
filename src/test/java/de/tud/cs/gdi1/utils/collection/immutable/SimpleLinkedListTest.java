package de.tud.cs.gdi1.utils.collection.immutable;

import org.junit.Assert;
import org.junit.Test;

import de.tud.cs.gdi1.utils.UseCase;

@UseCase(id = "4711")
public class SimpleLinkedListTest {

    @SuppressWarnings("unused")
    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        new SimpleLinkedList(null);
    }

    @Test
    public void testCreate() {
        Object o = "E1";
        ISimpleLinkedList l = new SimpleLinkedList(o);
        Assert.assertEquals(o, l.getValue());
        Assert.assertNull(l.getRest());

        ISimpleLinkedList l2 = new SimpleLinkedList("E1", new SimpleLinkedList("E2"));
        Assert.assertEquals("E1", l2.getValue());
        Assert.assertEquals("E2", l2.getRest().getValue());
    }

    @Test
    public void testToString() {
        Object o = "EX";
        ISimpleLinkedList l = new SimpleLinkedList(o);
        l.toString();
    }

}
