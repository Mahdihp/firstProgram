public class CreditCard {
    private String cardNumber;
    private double credit;

    public CreditCard(String cardNumber, double credit) {
        this.cardNumber = cardNumber;
        this.credit = credit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
