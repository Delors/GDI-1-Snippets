package de.tud.cs.gdi1.universitymanagement;

public class ArabicName implements Name {

    private String firstName;

    private String secondName;

    private String fathersName;

    private String familyName;

    public ArabicName(String firstName, String secondName, String fathersName, String familyName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fathersName = fathersName;
        this.familyName = familyName;
    }

    protected String getFathersName() {
        return fathersName;
    }

    /**
     * Gets the form of address as usable to address a specific person in a letter that has a proper
     * arabic name as used in the middle east.
     */
    public String getFormOfAddress() {
        return firstName + " " + secondName + " " + fathersName + " " + familyName;
    }

}
