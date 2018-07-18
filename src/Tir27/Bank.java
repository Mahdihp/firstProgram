package Tir27;

import java.util.Scanner;

public class Bank {

    private static Scanner scanner = new Scanner(System.in);

    private static Account[] accounts;

    public static void main(String[] args) {
        int size = Integer.valueOf(scanner.nextLine());
        accounts = new Account[size];

        for (int i = 0; i < accounts.length; i++) {
            int balance = Integer.valueOf(scanner.nextLine());
            int type = Integer.valueOf(scanner.nextLine());
            if (type == 1) {
                int profit = Integer.valueOf(scanner.nextLine());
                AccountA accountA = new AccountA(balance, profit);
                accounts[i] = accountA;
            }
            if (type == 2) {
                String cardNumber = scanner.nextLine();
                AccountB accountB = new AccountB(balance, cardNumber);
                accounts[i] = accountB;
            }
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
        for (Account account : accounts)
            account.print();
    }

}
