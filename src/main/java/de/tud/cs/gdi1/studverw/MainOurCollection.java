package de.tud.cs.gdi1.studverw;

import de.tud.cs.gdi1.utils.collection.immutable.List;
import de.tud.cs.gdi1.utils.collection.immutable.ISimpleLinkedList;
import de.tud.cs.gdi1.utils.collection.immutable.SimpleLinkedList;

// Requires Java 7 due to the use of the "diamond-operator": <>
public class MainOurCollection {

    public static void main(String[] args) throws NameException {

        Student s1 = new Student("Peter", "Müller");
        Student s2 = new Student("Max", "Müller");
        Student s3 = new Student("Max", "Müller");
        Dozent dozent = new Dozent("Michael", "Eichberg");

        List<Student> glls = new List<>(s1).prepend(s2).prepend(s3);
        /* List<Person> gllps = */List.prepend(dozent, glls);

        // USING OUR SIMPLE_LINKED_LIST --------------------------------------------------------
        SimpleLinkedList sListOfStudents = new SimpleLinkedList(s2, new SimpleLinkedList(s1));
        Object v1 = ((Student) sListOfStudents.getValue()).getGivenName();
        System.out.println(v1);

        ISimpleLinkedList sListOfPersons = new SimpleLinkedList(dozent, sListOfStudents);
        String v2 = ((Person) sListOfPersons.getValue()).getGivenName();
        System.out.println(v2);

        printStudents(sListOfPersons);

        // USING OUR GENERIC_LINKED_LIST -------------------------------------------------------
        List<Student> gListOfStudents = new List<>(s2, new List<>(s1));
        Object v3 = gListOfStudents.getHead().getGivenName();
        System.out.println(v3);

        List<Student> filteredGListOfStudents = gListOfStudents.filter(new PersonFilter(
                "Max", "Müller"));
        System.out.println(filteredGListOfStudents);

        List<Dozent> gListOfDozent = new List<>(dozent);
        Object v4 = gListOfDozent.getHead().getTutor();
        System.out.println(v4);

        List<Person> gListOfGDIPersons = new List<Person>(dozent, gListOfStudents);
        Object v5 = gListOfGDIPersons.getHead().getGivenName();
        System.out.println(v5);

    }

    public static void printStudents(ISimpleLinkedList persons) {
        if (persons == null)
            return;

        if (persons.getValue() instanceof Student) {
            System.out.println(persons.getValue());
        }

        printStudents(persons.getRest());
    }
}
