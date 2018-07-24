package tamrin_4;

public class TestClass {

    public static void main(String[] args) {
        BigInt bigInt1=new BigInt("25");
        BigInt bigInt2=new BigInt(25);
        System.out.println(bigInt1.intValue() + bigInt2.intValue());
        System.out.println(bigInt1.intValue() - bigInt2.intValue());
        System.out.println(bigInt1.intValue() / bigInt2.intValue());
        System.out.println(bigInt1.intValue() * bigInt2.intValue());
    }
}
