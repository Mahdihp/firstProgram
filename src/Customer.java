public class Customer {
    private String     name;
    private Account    account;
    private CreditCard creditCard;

    public Customer(String name, Account account, CreditCard creditCard) {
        this.name = name;
        this.account = account;
        this.creditCard = creditCard;
    }

    public double calCustomerBalance(){
        return account.getBalance() + creditCard.getCredit();
    }

}
