package de.tud.cs.gdi1.classesobjects;

import de.tud.cs.gdi1.utils.Requirement;

class Counter {
    int value;

    public Counter(int initialValue) {
        value = initialValue;
    }

    @Requirement(author="Michael Eichberg",id="101",value = "when the methods returns the value is larger than before")
    public int inc() {
        value = value + 1;
        return value;
    }

    public int dec() {
        value = value - 1;
        return value;
    }

    public int setValue(int value) {
        this.value = value;
        return this.value;
    }

    public int getCurrentVal() {
        return value;
    }
}
