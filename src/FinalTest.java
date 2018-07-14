public class FinalTest {

   private static final int MAX_AGE;

   static {
       MAX_AGE = 2;
   }

   private int age;

   public FinalTest() {
       age = 2;
   }

   public FinalTest(int age) {
       this.age = age;
   }

   public void setAge(int age) {
       this.age = age;
   }

    public static void main(String[] args) {
        EnumMultiTon e1 = EnumMultiTon.instance1;
        System.out.println(e1.getAge());
    }


}
