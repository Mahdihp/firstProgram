package Tir27;

public class AccountB {

    private int balance;
    private String cardNumber;

    public AccountB(int balance, String cardNumber) {
        this.balance = balance;
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void print() {
        System.out.println("balance = " + balance + ", cardNumber = " + cardNumber);
    }

}
