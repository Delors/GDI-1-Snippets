package de.tud.cs.gdi1.time_data_structure;

public class Time4 {
    final int secs;

    public Time4(int h, int m, int s) {
        this.secs = s + 60 * m + 60 * 60 * h;
    }

    public Time4(int s) {
        this.secs = s;
    }

    public int getHours() {
        return this.secs / 3600;
    }

    public int getMins() {
        return this.secs / 60 % 60;
    }

    public int getSecs() {
        return this.secs % 60;
    }

    public Time4 add(Time4 other) {
        Time4 t = new Time4(this.secs + other.secs);
        return t;
    }

    @Override
    public String toString() {
        return getHours() + ":" + getMins() + ":" + getSecs();
    }

    // LET'S TEST OUR APPLICATION
    public static void main(String[] args) {
        Time4 t1 = new Time4(1, 30, 30);
        Time4 t2 = new Time4(2, 30, 40);
        Time4 t3 = t1.add(t2);
        assert t3.toString().equals("4:1:10");
        System.out.println(t3.toString());
    }
}
