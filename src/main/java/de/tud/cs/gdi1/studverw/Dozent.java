package de.tud.cs.gdi1.studverw;

public class Dozent extends Person {

    private Student tutor;

    public Dozent(String givenName, String familyName) throws NameException {
        this(givenName, familyName, null);
    }

    public Dozent(String givenName, String familyName, Student tutor) throws NameException {
        super(givenName, familyName);
        this.tutor = tutor;
    }

    public Student getTutor() {
        return tutor;
    }

    public boolean hasTutor() {
        return tutor != null;
    }

    @Override
    public String toString() {
        return "Dozent [givenName=" + getGivenName() + "," + " familyName=" + getFamilyName() + "]";
    }

}
