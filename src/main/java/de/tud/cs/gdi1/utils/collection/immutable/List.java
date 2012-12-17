package de.tud.cs.gdi1.utils.collection.immutable;

public class List<E> {

    private E value;
    // If the compiler would realize that our List is immutable, we could write
    // List<E>... but the Java compiler is not smart enough.
    private final List<? extends E> rest;

    public List(E value) {
        this(value, null);
    }

    public List(E value, List<? extends E> rest) {
        super();

        if (value == null)
            throw new IllegalArgumentException();

        this.value = value;
        this.rest = rest;
    }

    public E getValue() {
        return value;
    }

    public List<E> prepend(E e) {
        return new List<>(e, this);
    }

    public static <E, T extends E, S extends E> List<E> prepend(T e, List<S> list) {
        return new List<>(e, list);
    }

    public void setValue(E value) {
        this.value = value;
    }

    public List<E> filter(Filter<? super E> f) {
        List<? extends E> list = this;
        List<E> filteredList = null;
        do {
            if (f.filter(list.value)) {
                filteredList = new List<>(list.value, filteredList);
            }
            list = list.rest;
        } while (list != null);

        return filteredList;
    }

    public List<? extends E> getRest() {
        return rest;
    }

    @Override
    public String toString() {
        String s = "" + value;
        List<?> r = this.rest;
        while (r != null) {
            s += ", " + r.value.toString();
            r = r.rest;
        }
        return s;
    }

}
