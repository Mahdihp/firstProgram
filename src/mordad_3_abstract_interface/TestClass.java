package mordad_3_abstract_interface;

import java.sql.SQLException;

public class TestClass {

    public static void main(String[] args) throws Exception {
        multi(0, 0);
    }

    public static void multi(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Zart nakon");
        }
    }
}
