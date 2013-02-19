package de.tud.cs.gdi1.utils.collection.immutable;

import de.tud.cs.gdi1.studverw.Person;

public class List<E> { // generische Klasse

    private E head;
    // If the compiler would realize that our List is immutable, we could write
    // List<E>... but the Java compiler is not smart enough.
    private final List<? extends E> rest;

    public List(E head) { this(head, null); }

    public List(E value, List<? extends E> rest) {
        this.head = value;
        this.rest = rest;
    }

    public E getHead() { return head; }

    public List<? extends E> getRest() { return rest; }
    
    public List<E> prepend(E e) { return new List<>(e, this); }

    // generische Methode
    public static <E, T extends E, S extends E> List<E> prepend(T e, List<S> list) {
        return new List<E>(e, list);
    }
    
    public List<E> filter(Filter<? super E> f) {
        List<? extends E> list = this;
        List<E> filteredList = null;
        do {
            if (f.filter(list.head)) {
                filteredList = new List<>(list.head, filteredList);
            }
            list = list.rest;
        } while (list != null);
        return filteredList;
    }

    @Override
    public String toString() {
        String s = "" + head;
        List<?> r = this.rest;
        while (r != null) {
            s += ", " + r.head.toString();
            r = r.rest;
        }
        return s;
    }

    public static void main(String[] args) throws Exception {
        // GENERAL RULE: TRY TO AVOID MIXING GENERICS AND ARRAYS
        @SuppressWarnings("unchecked")
        List<Person>[] myArrayOfLists = (List<Person>[]) new List<?>[20]; // arrays are covariant in
                                                                          // Java due to historical
                                                                          // reasons!

        myArrayOfLists[0] = new List<Person>(new Person("", ""));
        // myArrayOfLists[1] = new List<Dozent>(new Dozent("",""));

    }

}
