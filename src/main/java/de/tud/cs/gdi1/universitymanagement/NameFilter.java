package de.tud.cs.gdi1.universitymanagement;

import de.tud.cs.gdi1.utils.collection.immutable.Filter;

public class NameFilter implements Filter<Name> {

    private final String contains;

    public NameFilter(String contains) {
        this.contains = contains;
    }

    public boolean filter(Name name) {
        return name.getFormOfAddress().contains(contains);
    }

}
