import java.io.IOException;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.println(" + Jam");
            System.out.println(" - Tafrigh:");
            System.out.println(" * Zarb");
            System.out.println(" / Taghsim");
            System.out.print("Enter Your Choice:");
            String i = scanner.next();
            switch (i) {
                case "+":
                    jam();
                    break;
                case "-":
                    tafrigh();
                    break;
                case "*":
                    zarb();
                    break;
                case "/":
                    taghsim();
                    break;
            }
        }

    }

    private static void taghsim() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println( a +" / " + b +" = " +(a/b));
    }

    private static void zarb() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println( a +" * " + b +" = " +(a*b));
    }

    private static void tafrigh() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println( a +" - " + b +" = " +(a-b));

    }

    private static void jam() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println( a +" + " + b +" = " +(a+b));
    }
}

