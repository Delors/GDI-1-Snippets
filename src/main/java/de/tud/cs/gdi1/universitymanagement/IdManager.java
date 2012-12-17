package de.tud.cs.gdi1.universitymanagement;

public class IdManager {

    private static long last_id = 0;

    public static long getNextFreeId() {
        return last_id++;
    }

}
