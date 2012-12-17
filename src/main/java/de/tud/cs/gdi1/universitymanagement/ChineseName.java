package de.tud.cs.gdi1.universitymanagement;

public class ChineseName implements Name {

    private String givenName;

    private String familyName;

    public ChineseName(String givenName, String familyName) {
        super();
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    /**
     * Returns the name as usable to address a person in letter. The name is formatted:
     * "familyName givenName";
     */
    @Override
    public String getFormOfAddress() {

        return getFamilyName() + " " + getGivenName();
    }

}
