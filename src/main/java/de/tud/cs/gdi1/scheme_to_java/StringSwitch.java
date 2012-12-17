package de.tud.cs.gdi1.scheme_to_java;

import static java.lang.System.out;

public class StringSwitch {

    // requires Java 7 (switch over constant string expressions)
    public static void main(String[] args) throws Exception {
        for (String arg : args) {
            switch (arg.toLowerCase()) {
            case "time":
                out.println(new java.util.Date());
                break;
            case "ip":
                out.println(java.net.InetAddress.getLocalHost());
                break;

            default:
                out.println("The command-line arguement: " + arg + " is not supported.");
            }
        }
    }
}
