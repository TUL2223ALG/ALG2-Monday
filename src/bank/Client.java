package bank;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public abstract class Client {
    protected String name;
    ArrayList<Account> accounts;

    public Client(String name) {
        this.name = name;
    }
    
    public void addAccount(double balance) {
        accounts.add(new Account(balance));
    }
    
    public double getTotalBalance() {
        double totalSum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            totalSum += accounts.get(i).getBalance();            
        }
        return totalSum;
    }
    
    public abstract String getInfo();
}
