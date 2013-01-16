package de.tud.cs.gdi1.classesobjects;

class Person {

    long matriculationNumber;

    String name;

    public Person(String initialName, long initialMatriculationNumber) {
        matriculationNumber = initialMatriculationNumber;
        name = initialName;
    }

    public long getMatriculationNumber() {
        return matriculationNumber;
    }

    public String getName() {
        return name;
    }

    /**
     * Updates the name of the person; e.g., after a marriage.
     * 
     * @param newName
     *            The new name. Must not be <code>null</code>.
     */
    public void setName(String newName) {
        this.name = newName;
    }

}
