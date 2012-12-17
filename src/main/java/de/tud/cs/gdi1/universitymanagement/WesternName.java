package de.tud.cs.gdi1.universitymanagement;

public final class WesternName implements Name {

    private String givenName;

    private String familyName;

    public WesternName(String givenName, String familyName) {
        super();
        this.givenName = givenName;
        this.familyName = familyName;
    }

    /**
     * Returns the name such that it can be used to address a person in a letter. The name is
     * formatted in the usual manner: "givenName familyName";
     */
    public String getFormOfAddress() {
        return givenName + " " + familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((familyName == null) ? 0 : familyName.hashCode());
        result = prime * result + ((givenName == null) ? 0 : givenName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WesternName other = (WesternName) obj;
        if (familyName == null) {
            if (other.familyName != null)
                return false;
        } else if (!familyName.equals(other.familyName))
            return false;
        if (givenName == null) {
            if (other.givenName != null)
                return false;
        } else if (!givenName.equals(other.givenName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "WesternName [givenName=" + givenName + ", familyName=" + familyName + "]";
    }

}