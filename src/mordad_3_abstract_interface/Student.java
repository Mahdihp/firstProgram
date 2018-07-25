package mordad_3_abstract_interface;

public class Student implements LuxuryPrintable {
    private String name;
    private int age;

    @Override
    public void print() {
        System.out.println("Name : " + name + ", Age : " + age);
    }

    @Override
    public void luxuryPrint() {
        System.out.println("Printing Student...");
        print();
    }
}
