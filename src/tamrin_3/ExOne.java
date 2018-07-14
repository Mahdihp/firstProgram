package tamrin_3;

import java.util.Scanner;

public class ExOne {

    public static void decimalToBinary(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return; // KICK OUT OF THE RECURSION
        }

        remainder = number % 2;
        decimalToBinary(number >> 1);
        System.out.print(remainder);
    }
    public static void binaryToDecimal(String number){
        System.out.println(Integer.parseInt(number,2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num = sc.next();
//        decimalToBinary(Integer.valueOf(num));
        binaryToDecimal(num);
    }
}
