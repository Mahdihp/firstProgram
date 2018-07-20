package tamrin_4;

public class TestClass {

    public static void main(String[] args) {
        BigInt bigInt1=new BigInt("22");
        BigInt bigInt2=new BigInt(22);
        System.out.println(bigInt1.intValue() + bigInt2.intValue());
    }
}
