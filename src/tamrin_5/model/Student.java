package tamrin_5.model;

public class Student extends Person {

    private String Address;
    private int teacher_id;

    public Student() {
        super();
    }

    public Student(int id, String fname, String lname, String address, int teacher_id) {
        super(id,fname,lname);
        Address = address;
        this.teacher_id = teacher_id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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
                "Address='" + Address + '\'' +
                ", teacher_id=" + teacher_id +
                "} " + super.toString();
    }
}
