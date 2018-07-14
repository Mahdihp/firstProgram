package tamrin_in_class_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

    private List<Account> accountList=new ArrayList<>();
    private int day = 0;
    public List<Account> getAccounts(){
        return accountList;
    }
    public void deposit(int ID, int money){
        Iterator<Account> iterator = accountList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(ID)){
                double balance = iterator.next().getBalance();
                balance+= money;
                iterator.next().deposit(money);
            }
        }
    }
    public void withdraw(int ID, int money){
        Iterator<Account> iterator = accountList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(ID)){
                double balance = iterator.next().getBalance();
                balance -= money;
                iterator.next().deposit(money);
            }
        }
    }
    public void setDay(int day){
        this.day = day;
    }
}
