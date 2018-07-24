package tamrin_5.model;

public class Teacher extends Person {

    private String address;

    public Teacher( String fname, String lname, String address) {
        super(fname,lname);
        this.address = address;
    }

    public Teacher(int id, String fname, String lname, String address) {
        super(id,fname,lname);
        this.address = address;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
