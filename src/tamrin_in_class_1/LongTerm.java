package tamrin_in_class_1;

public class LongTerm extends Account {

    @Override
    public int benefit(int days) {
        return (int) ((getBalance() * 365) * 24 * days);
    }

    @Override
    public void withdraw(int money) {
        if (getBalance() > 15000) {
            setBalance(getBalance() - money);
        }
    }
}
