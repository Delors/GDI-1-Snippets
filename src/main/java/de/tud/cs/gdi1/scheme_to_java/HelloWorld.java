package de.tud.cs.gdi1.scheme_to_java;

public class HelloWorld {

    public static void main(String[] args) {
    // second -> millisecond -> microsecond -> nanosecond 10^-9
        long start = System.nanoTime(); 
        System.out.println("Hallo Welt!");
        long end = System.nanoTime();
        long duration = end-start; 
        System.out.println(duration);        
    }

}
