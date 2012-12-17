package de.tud.cs.gdi1.universitymanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainJDKCollections extends Object {

    public static void main(String[] args) {
        Student s1 = new Student(new WesternName("Michael", "Eichberg"), "Moon");
        Student s2 = new Student(new WesternName("Alice", "Eichberg"), "Sun");
        Student s3 = new Student(new WesternName("Michael", "Eichberg"), "Jupiter");

        Lecturer l = new Lecturer(new WesternName("Michael", "Williams"), "Uranus");

        List<Student> ls = new LinkedList<>();
        ls.add(0, s1);
        ls.add(0, s2);
        ls.add(0, s3);
        // System.out.println(ls);

        // Iterator<Student> it = ls.iterator();
        // while (it.hasNext()) {
        // Student s = it.next();
        // }

        Set<Name> names = new HashSet<Name>();
        for (Student s : ls) {
            names.add(s.getName());
        }
        // System.out.println(names);

        Map<Lecturer, List<Student>> lecturerToStudents = new HashMap<>();
        lecturerToStudents.put(l, new ArrayList<Student>());
        lecturerToStudents.get(l).add(s2);
        lecturerToStudents.get(l).add(s3);
        System.out.println(lecturerToStudents);

        List<? extends Person> ll = new LinkedList<Person>();
        ll = ls;
        ll.add(null);

    }
}
