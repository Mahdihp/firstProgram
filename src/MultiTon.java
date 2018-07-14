public class MultiTon {

    int age;

    private MultiTon(int age) {
        this.age = age;
    }

    private static final MultiTon instance1 = new MultiTon(1);
    private static final MultiTon instance2 = new MultiTon(2);
    private static final MultiTon instance3 = new MultiTon(3);

    public static MultiTon getInstance1() {
        return instance1;
    }

    public static MultiTon getInstance2() {
        return instance2;
    }

    public static MultiTon getInstance3() {
        return instance3;
    }

    public static void main(String[] args) {
        MultiTon multiTon1 = MultiTon.getInstance1();
    }
}
