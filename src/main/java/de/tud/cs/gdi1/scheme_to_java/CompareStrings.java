package de.tud.cs.gdi1.scheme_to_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompareStrings {

    public static void main(String[] args) throws Exception {
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("First string: ");
            String s1 = in.readLine();
            System.out.print("Second string: ");
            String s2 = in.readLine();
            System.out.println("==        ? " + (s2 == s1));
            System.out.println(".equals() ? " + (s2.equals(s1)));
        }

        {
            String s1 = "jj";
            String s2 = "jj";

            System.out.println("==        ? " + (s2 == s1));
            System.out.println(".equals() ? " + (s2.equals(s1)));
        }
    }

}
