package Tir27;

public class AccountA extends Account {

    private int profit;

    public AccountA(int profit, int balance) {
        super(balance);
        this.profit = profit;
    }


    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void print() {
        System.out.println("profit = " + profit);
        super.print();
    }

}
