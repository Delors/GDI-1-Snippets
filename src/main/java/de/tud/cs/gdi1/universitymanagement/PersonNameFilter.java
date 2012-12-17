package de.tud.cs.gdi1.universitymanagement;

import de.tud.cs.gdi1.utils.collection.immutable.Filter;

public class PersonNameFilter implements Filter<Person> {

    private final String contains;

    public PersonNameFilter(String contains) {
        this.contains = contains;
    }

    public boolean filter(Person person) {
        return person.getName().getFormOfAddress().contains(contains);
    }

}
