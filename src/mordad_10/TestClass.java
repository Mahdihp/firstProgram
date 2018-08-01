package mordad_10;

public class TestClass {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                print(i * j);
            }
            System.out.println();
        }

    }

    private static void print(int i) {
        System.out.print(i + " ");
    }
}
