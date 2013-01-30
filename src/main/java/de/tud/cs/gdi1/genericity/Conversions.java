package de.tud.cs.gdi1.genericity;

import java.util.HashSet;
import java.util.Set;

public class Conversions {

    @SuppressWarnings({ "unused" })
    public static void main(String[] args) throws Exception {

        // Referenztypen

        String str = "dfsdf";
        Object o = str; // widening =dt. Verbreiterung

        // Set<?> set1 = (Set<?>) str; // doesn't compile
        Set<?> set2 = (Set<?>) o; // narrowing =dt. Verengung; wird zur Laufzeit getestet (wird fehl schlagen)

        HashSet<Object> hso = new HashSet<>();
        Set<String> ss = null;
        
        // ss = so; // not type safe
        // so = ss; // not type safe
        
        Set<Object> so = hso;
    }
}
