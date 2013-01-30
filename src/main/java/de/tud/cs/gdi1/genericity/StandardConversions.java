package de.tud.cs.gdi1.genericity;


public class StandardConversions {

    @SuppressWarnings({ "unused", "boxing" })
    public static void main(String[] args) throws Exception {
        byte b = 0;
        short s = 12;
        int i = 0b1101011101;
        float f = 120.0f;
        long l = 0xab_cel; // "_" has no effect ; just for readability
        double d = -12342e23d;

        int i0 = b;
        int i1 = s;
        int i2 = i;
        int i3 = (int) f;

        float f0 = b;
        float f1 = s;
        float f2 = i; // possible loss!
        float f3 = f;

        // information loss demonstrated
        int iMaxMinus1 = Class.forName("java.lang.Integer").getDeclaredField("MAX_VALUE")
                .getInt(null) - 1;
        @SuppressWarnings("cast")
        float fiMax = (float) iMaxMinus1;
        System.out.println(fiMax + " <=> " + ((int) fiMax) + " <=> " + iMaxMinus1);

        // (Un-)Boxing

        Object integer = 1;
        if (integer instanceof java.lang.Integer) {
            System.out.println("Yes... it is an object.");
        }
        double dInteger = (Integer) integer;
        System.out.println(dInteger);

        // Referenztypen

        String str = "dfsdf";
        Object o = str; // widening =dt. Verbreiterung
    }
}
