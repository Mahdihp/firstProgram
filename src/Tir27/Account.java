package Tir27;

public class Account {

    private int balance;
    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void print() {
        System.out.println("balance = " + balance);
    }
}
