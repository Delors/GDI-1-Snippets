package de.tud.cs.gdi1.scheme_to_java;

import static java.lang.System.out;
import static java.lang.String.valueOf;

// The following code contains one bug (deliberately) to demonstrate debugging. 
// The bug is described at the very end of the file.

public class Base3WithBug {

    static String toBase3Recursive(int value) {
        if (value > 3) {
            return toBase3Recursive(value / 3) + valueOf(value % 3);
        } else {
            return valueOf(value % 3);
        }
    }

    public static void main(String[] args) {
        out.println(toBase3Recursive(0));
        out.println(toBase3Recursive(1));
        out.println(toBase3Recursive(2));
        out.println(toBase3Recursive(10));
        out.println(toBase3Recursive(11));
        out.println(toBase3Recursive(12));
    }

}









































































// The test "if (value > 3) {..." has to be replaced by "if (value >= 3) {..."
