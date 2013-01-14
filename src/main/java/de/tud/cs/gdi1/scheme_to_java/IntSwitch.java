package de.tud.cs.gdi1.scheme_to_java;

public class IntSwitch {
    public static void main(String[] args) {

        switch (Integer.valueOf(args[0]).intValue()) {
        case 0:
            System.out.print("0");            
            break;
        case 1:
            System.out.print("-1");
            break;
        default:
            System.out.println("etwas anderes");
        }
    }
}
