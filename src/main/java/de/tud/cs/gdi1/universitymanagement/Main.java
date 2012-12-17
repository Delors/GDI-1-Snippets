package de.tud.cs.gdi1.universitymanagement;

import de.tud.cs.gdi1.utils.collection.immutable.List;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Student s1 = new Student(new WesternName("Michael", "Eichberg"), "Moon");
        Student s2 = new Student(new WesternName("Alice", "Eichberg"), "Sun");
        Lecturer d = new Lecturer(new WesternName("Karl", "Williams"), "Jupiter");

        List<Student> prepsStudsList = new List<>(s1).prepend(s2);
        List<Person> prepsPersList = List.prepend((Person) d, prepsStudsList);

        List<Student> ls = new List<>(s1);
        // List<Person> lp = ls; (does not compile; it is not type safe)

        List<Student> students = new List<>(s2, new List<>(s1));

        students.filter(new PersonNameFilter("Eichberg"));
        List<Person> persons = new List<>(d, students);

        List<?> filteredList = persons.filter(new PersonNameFilter("Eichberg"));
        System.out.println(filteredList);

        List<? extends Person> rest = persons;
        while (rest != null) {
            Person s = rest.getValue();
            System.out.println(s.getName().getFormOfAddress());

            rest = rest.getRest();
            // rest.setValue(null);
        }

    }
}
