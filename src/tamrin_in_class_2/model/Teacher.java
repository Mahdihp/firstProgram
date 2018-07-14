package tamrin_in_class_2.model;

public class Teacher extends Person {

    private String dept;

    public Teacher(int id, String fname, String lname, String dept) {
        super(id,fname,lname);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "dept='" + dept + '\'' +
                "} " + super.toString();
    }
}
