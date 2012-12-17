package de.tud.cs.gdi1.studverw;

public class Student extends Person implements Comparable<Student> {

    private static long next_student_id;

    static {
        next_student_id = 1; // FIXME read the initial value of next_student_id from disk
    }

    private long studentId;

    public Student(String givenName, String familyName) throws NameException {
        super(givenName, familyName);
        this.studentId = next_student_id++;
    }

    public Student(String givenName, String familyName, int studentId) throws NameException {
        super(givenName, familyName);

        if (studentId >= next_student_id)
            next_student_id = studentId + 1;
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (studentId ^ (studentId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [givenName=" + getGivenName() + "," + " familyName=" + getFamilyName()
                + ", studentId=" + studentId + "]";
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.studentId - o.studentId);
    }

}
