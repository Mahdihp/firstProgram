

public class TestClass {

    public static void main(String[] args) {


    }

    public boolean checkObject(Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return false;
        return (o1.getClass().equals(o2.getClass()));
    }

}
