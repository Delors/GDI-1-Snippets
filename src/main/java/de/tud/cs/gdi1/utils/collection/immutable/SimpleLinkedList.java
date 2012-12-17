package de.tud.cs.gdi1.utils.collection.immutable;

/**
 * An immutable linked list.
 */
public class SimpleLinkedList extends Object implements ISimpleLinkedList {

    private final Object value;
    private final SimpleLinkedList next;

    /**
     * Creates a new list with the given value as its sole member.
     * 
     * @param value
     *            some object. Must not be null;
     * @throws IllegalArgumentException
     *             If value is null.
     */
    public SimpleLinkedList(Object value) {
        this(value, null);
    }

    public SimpleLinkedList(Object value, SimpleLinkedList next) {
        if (value == null)
            throw new IllegalArgumentException();

        this.value = value;
        this.next = next;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public ISimpleLinkedList getRest() {
        return next;
    }

    @Override
    public String toString() {
        String s = value.toString();
        SimpleLinkedList l = this.next;
        while (l != null) {
            s += ", " + l.value.toString();
            l = l.next;
        }

        return s;
    }

}
