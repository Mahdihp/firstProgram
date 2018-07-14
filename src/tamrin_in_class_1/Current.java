package tamrin_in_class_1;

public class Current extends Account {
    @Override
    public int benefit(int days) {
        return (int) ((getBalance() * 365) * 0 * days);
    }

    @Override
    public void withdraw(int money) {
        if (getBalance() > 0) {
            setBalance(getBalance() - money);
        }
    }
}
