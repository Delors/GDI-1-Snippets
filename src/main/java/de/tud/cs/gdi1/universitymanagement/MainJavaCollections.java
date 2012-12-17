package de.tud.cs.gdi1.universitymanagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainJavaCollections {

    public static void main(String[] args) {
        Student s1 = new Student(new WesternName("Michael", "Eichberg"), "Sun");
        Student s2 = new Student(new WesternName("Alice", "Eichberg"), "Sun");
        Student s3 = new Student(new WesternName("Michael", "Eichberg"), "Moon");

        // ///////////////////////////////// 1st Example
        List<Student> ls = new ArrayList<>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        System.out.println(ls.toString());

        // ///////////////////////////////// 2nd Example
        Set<Name> sn = new HashSet<>();
        for (Student s : ls) {
            sn.add(s.getName());
        }
        System.out.println(sn); // prints out all three names, unless we have implemented equals and
                                // hashCode correctly!

        System.exit(0);
    }
}
