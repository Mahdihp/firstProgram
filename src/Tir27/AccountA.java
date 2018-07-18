package Tir27;

import java.util.Scanner;

public class AccountA {

    private int balance;
    private int profit;

    public AccountA(int balance, int profit) {
        this.balance = balance;
        this.profit = profit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void print() {
        System.out.println("balance = " + balance + ", profit = " + profit);
    }

}
