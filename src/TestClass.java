import Tir27.Recangle;
import Tir27.Shape;

public class TestClass {

    public static void main(String[] args) {

        Shape shape=new Recangle(10,15);
        ((Recangle) shape).draw();
    }

    public boolean checkObject(Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return false;
        return (o1.getClass() == o2.getClass());
    }

}
