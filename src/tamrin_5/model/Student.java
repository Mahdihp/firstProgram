package tamrin_5.model;

public class Student extends Person {

    private String department;
    private int teacher_id;

    public Student() {
        super();
    }

    public Student(String fname, String lname, String department, int teacher_id) {
        super(fname,lname);
       this.department = department;
        this.teacher_id = teacher_id;
    }

    public Student(int id, String fname, String lname, String department, int teacher_id) {
        super(id, fname, lname);
        department = department;
        this.teacher_id = teacher_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "department='" + department + '\'' +
                ", teacher_id=" + teacher_id +
                "} " + super.toString();
    }
}
