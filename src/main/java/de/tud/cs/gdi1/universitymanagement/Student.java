package de.tud.cs.gdi1.universitymanagement;

public class Student extends Person {

    private long student_id;

    public Student(Name name, String address) {
        super(name, address);

        this.student_id = IdManager.getNextFreeId();
    }

    public String getFullAddress() {
        return getName().getFormOfAddress() + "\n" + getAddress();
    }

    public long getStudentId() {
        return student_id;
    }

    public static void main(String[] args) throws Exception {
        Student e1 = new Student(new WesternName("Michael", "Eichberg"), "Private");
        Student e2 = new Student(ThaiName.checkAndCreateThaiName("Wu"), "China");
        Student e3 = new Student(new ChineseName("Li", "Wu"), "China");

        System.out.println(e1.getStudentId());
        System.out.println(e2.getStudentId());
        System.out.println(e3.getStudentId());
    }
}
