package de.tud.cs.gdi1.scheme_to_java;

import static java.lang.System.out;
import static java.lang.String.valueOf;

public class Base3 {

    static String toBase3Recursive(int value) {
        if (value >= 3) {
            return toBase3Recursive(value / 3) + valueOf(value % 3);
        } else {
            return valueOf(value % 3);
        }
    }

    static String toBase3Recursive2(int value) {
        return (value >= 3 ? toBase3Recursive2(value / 3) : "") + valueOf(value % 3);
    }

    @SuppressWarnings("all")
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
        out.println(toBase3Recursive(10));
        out.println(toBase3Recursive(11));
        out.println(toBase3Recursive(12));
        out.println(toBase3Recursive(13));
        out.println(toBase3Recursive2(14));
        out.println(toBase3Recursive2(15));
        out.println(toBase3Recursive2(16));
        out.println(toBase3Recursive2(17));
        // out.println(toBase3(Integer.parseInt(args[0])));
    }

}
