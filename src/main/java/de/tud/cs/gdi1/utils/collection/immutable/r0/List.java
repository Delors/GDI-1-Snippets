package de.tud.cs.gdi1.utils.collection.immutable.r0;

public class List {

    private Object head;

    private final List rest;

    public List(Object value, List rest) {
        this.head = value;
        this.rest = rest;
    }

    public List(Object head) { this(head, null);  }

    public Object getHead() { return head; }

    public List getRest() { return rest; }

    public List prepend(Object e) { return new List(e, this); }

    public List filter(Filter f) {
        List list = this;
        List filteredList = null;
        do {
            if (f.filter(list.head)) {
                filteredList = new List(list.head, filteredList);
            }
            list = list.rest;
        } while (list != null);
        return filteredList;
    }

    @Override
    public String toString() {
        return head + (rest == null ? "" : ", "+rest.toString() );        
    }
}
