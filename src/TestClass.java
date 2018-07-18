public class TestClass {
    public static void main(String[] args) {

        long l1 = 2; // upCasting primitive
        long l2 = 2l; //
        Long l3 = new Long(2l);
        Long l4 = new Long(2);// upCasting primitive
        Long l5 = 2L;// AutoBoxing
        Long l6 = 2; //Compile Error
    }

}
