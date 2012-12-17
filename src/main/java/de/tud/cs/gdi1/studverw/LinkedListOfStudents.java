package de.tud.cs.gdi1.studverw;

import de.tud.cs.gdi1.utils.collection.immutable.ISimpleLinkedList;

public class LinkedListOfStudents implements ISimpleLinkedList {

    private final Student head;
    private final LinkedListOfStudents tail;

    /**
     * Creates a new list that has one element.
     * 
     * @param head
     *            some object. Must not be null;
     * @throws IllegalArgumentException
     *             If value is null.
     */
    public LinkedListOfStudents(Student head) {
        this(head, null);
    }

    public LinkedListOfStudents(Student head, LinkedListOfStudents tail) {
        if (head == null)
            throw new IllegalArgumentException();

        this.head = head;
        this.tail = tail;
    }

    public Student getValue() {
        return head;
    }

    public LinkedListOfStudents getRest() {
        return tail;
    }

    @Override
    public String toString() {
        String s = head.toString();
        LinkedListOfStudents l = this.tail;
        while (l != null) {
            s += ", " + l.head.toString();
            l = l.tail;
        }

        return s;
    }

}
