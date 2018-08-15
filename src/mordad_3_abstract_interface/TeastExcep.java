package mordad_3_abstract_interface;

public class TeastExcep {

    public static void main(String[] args) {
        try {
            TestClass.multi(3, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
