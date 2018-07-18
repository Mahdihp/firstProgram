package Tir27;

public class AccountB extends Account {

    private String cardNumber;

    public AccountB(int balance, String cardNumber) {
        super(balance);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }


    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("cardNumber = " + cardNumber);
    }

}
