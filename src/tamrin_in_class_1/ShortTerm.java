package tamrin_in_class_1;

public class ShortTerm extends Account {

    @Override
    public int benefit(int days) {
        return (int) ((getBalance() * 365) * 17 * days);
    }

    @Override
    public void withdraw(int money) {
        if (getBalance() > 10000) {
            setBalance(getBalance() - money);
        }
    }
}
