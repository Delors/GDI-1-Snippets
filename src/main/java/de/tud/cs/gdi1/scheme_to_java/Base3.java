package de.tud.cs.gdi1.scheme_to_java;

import static java.lang.System.out;

public class Base3 {

    static String toBase3Recursive(int value) {
        if (value >= 3) {
            return toBase3(value / 3) + String.valueOf(value % 3);
        } else {
            return String.valueOf(value % 3);
        }
    }

    static String toBase3(int value) {
        String s = "";
        do {
            s = value % 3 + s;
            value = value / 3;
        } while (value > 0);
        return s;
    }

    public static void main(String[] args) {
        out.println(toBase3(0));
        out.println(toBase3(1));
        out.println(toBase3(2));
        out.println(toBase3(3));
        out.println(toBase3(10));
        out.println(toBase3(11));
        out.println(toBase3(12));
        out.println(toBase3(13));
        out.println(toBase3(14));
        out.println(toBase3(15));
        out.println(toBase3(16));
        out.println(toBase3(17));
        // out.println(toBase3(Integer.parseInt(args[0])));
    }

}
