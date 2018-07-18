package Tir27;

import java.util.Scanner;

public class Bank {

    private static Scanner scanner = new Scanner(System.in);

    private static AccountA[] accountAs;
    private static AccountB[] accountBs;

    public static void main(String[] args) {
        int size = Integer.valueOf(scanner.nextLine());
        accountAs = new AccountA[size];
        accountBs = new AccountB[size];

        for (int i = 0; i < accountAs.length; i++) {
            int balance = Integer.valueOf(scanner.nextLine());
            int profit = Integer.valueOf(scanner.nextLine());
            AccountA accountA = new AccountA(balance, profit);
            accountAs[i] = accountA;
        }

        for (int i = 0; i < accountBs.length; i++) {
            int balance = Integer.valueOf(scanner.nextLine());
            String cardNumber = scanner.nextLine();
            AccountB accountB = new AccountB(balance, cardNumber);
            accountBs[i] = accountB;
        }

        while (true) {
            System.out.println("1 - print");
            int choice = Integer.valueOf(scanner.nextLine());
            if (choice == 1) {
                print();
            }
        }
    }

    private static void print() {
        for (AccountA accountA : accountAs)
            accountA.print();
        for (AccountB accountB : accountBs)
            accountB.print();
    }

}
