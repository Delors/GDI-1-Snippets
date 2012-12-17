package de.tud.cs.gdi1.universitymanagement;

public abstract class Person extends Object {

    private String address;

    private Name name;

    public Person(Name name, String address) {
        super();
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [" + getName().getFormOfAddress() + "]";
    }

}