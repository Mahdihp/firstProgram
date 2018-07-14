package tamrin_in_class_1;

public class Account {
    private double balance;
    private String accountNumber;
    private AccountType accountType;

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

    public int benefit(int days) {
        switch (accountType) {
            case ShortTerm:
                return (int) ((balance * 365000) * 17 * days);
            case LongTerm:
                return (int) ((balance * 365) * 24 * days);
            case Current:
                return (int) ((balance * 365) * 0 * days);
            case GharzolHasane:
                return (int) ((balance * 365) * 12 * days);
            default:
                return 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getId() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    enum AccountType {
        ShortTerm,
        LongTerm,
        Current,
        GharzolHasane;

    }
}
