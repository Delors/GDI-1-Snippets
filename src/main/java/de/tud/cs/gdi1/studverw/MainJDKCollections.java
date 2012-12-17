package de.tud.cs.gdi1.studverw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainJDKCollections {

    public static void main(String[] args) throws NameException {

        Student s1 = new Student("Peter", "Müller", 1);
        Student s2 = new Student("Max", "Müller", 2);
        Student s3 = new Student("Max", "Müller", 2);
        // Dozent dozent = new Dozent("Michael", "Eichberg");

        // Set<Student> studentsSet =new HashSet<Student>();
        // studentsSet.add(s1);
        // studentsSet.add(s2);
        // studentsSet.add(s3);
        // System.out.println(studentsSet);

        SortedSet<Student> sortedSetOfStudents = new TreeSet<>();
        sortedSetOfStudents.add(s1);
        sortedSetOfStudents.add(s2);
        System.out.println(sortedSetOfStudents);

        List<Student> ls = new ArrayList<>();
        // Iterator<?> it = ls.iterator();
        // while (it.hasNext()) {
        // it.next();
        // }
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);

        for (Student s : ls) {
            System.out.println(s);
        }
        // the following is basically equivalent to the previous for(-each) loop
        Iterator<Student> i = ls.iterator();
        while (i.hasNext()) {
            Student s = i.next();
            System.out.println(s.toString());
        }

    }

}
