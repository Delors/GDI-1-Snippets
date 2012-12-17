package de.tud.cs.gdi1.studverw;

import de.tud.cs.gdi1.utils.collection.immutable.Filter;

public class PersonFilter implements Filter<Person> {

    private String givenName;
    private String familyName;

    public PersonFilter(String givenName, String familyName) {
        super();
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public boolean filter(Person p) {
        return p.getFamilyName().equals(familyName) & p.getGivenName().equals(givenName);
    }

}
