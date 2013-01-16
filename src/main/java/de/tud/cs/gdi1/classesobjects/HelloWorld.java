package de.tud.cs.gdi1.classesobjects;

import static java.lang.System.out;

public class HelloWorld {

    public static void main(String[] args) {
        long start = System.nanoTime();
        out.println("Hallo Welt!");
        out.println(System.nanoTime() - start);
    }

}
