package Tir27;

public class AccountB extends Account {

    private String cardNumber;

    public AccountB(String cardNumber, int balance) {
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
