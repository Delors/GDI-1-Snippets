package de.tud.cs.gdi1.utils.collection.immutable.r1;

import de.tud.cs.gdi1.studverw.Dozent;

public class List<E> { // generische Klasse

    private E head;

    private final List<E> rest;

    public List(E head) { this(head, null); }

    public List(E value, List<E> rest) {
        if (value == null) throw new IllegalArgumentException();
        this.head = value;
        this.rest = rest;
    }

    public Object getHead() { return head; }

    public List<E> getRest() { return rest; }

    public List<E> prepend(E e) { return new List<>(e, this); }

    public List<E> filter(Filter f) { // keine Typsicherheit bzgl. Filter
        List<E> list = this;
        List<E> filteredList = null;
        do {
            if (f.filter(list.head)) {
                filteredList = new List<E>(list.head, filteredList);
            }
            list = list.rest;
        } while (list != null);
        return filteredList;
    }

    @Override public String toString() {
        return head + (rest == null ? "" : ", "+rest.toString()); 
    }

    public static void main(String[] args) throws Exception {
        // List<Person> l = new List<>(new Dozent("Michael", "Eichberg")); // doesn't compile,
        // because the wrong type is inferred
        
        List<Dozent> ld = new List<Dozent>(new Dozent("Michael", "Eichberg"));
        // doesn't compile: ld.prepend(new Student("Max", "Müller"));
        
        // doesn't compile: List<Person> lp = new List<Person>(new Person("Sabine","Ohnesorg"),ld);
    }

}
