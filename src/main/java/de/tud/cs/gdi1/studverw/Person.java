package de.tud.cs.gdi1.studverw;

public class Person extends Object {

    private String givenName;
    private String familyName;

    public Person(String givenName, String familyName) throws NameException {
        if (givenName == null || familyName == null) {
            throw new IllegalArgumentException();
        }
        if (givenName.length() <= 1 || familyName.length() <= 1) {
            throw new NameException("every part of a name has to have more than one character");
        }

        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    @Override
    public String toString() {
        return "Person [givenName=" + givenName + "," + " familyName=" + familyName + "]";
    }

}
