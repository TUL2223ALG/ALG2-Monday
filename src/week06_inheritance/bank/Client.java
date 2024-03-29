package week06_inheritance.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Client implements Comparable<Client>{
    protected String name;
    List<Account> accounts = new ArrayList<>();

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

    @Override
    public int compareTo(Client c) {
        return Double.compare(this.getTotalBalance(), c.getTotalBalance());
    }

    @Override
    public String toString() {
        return getInfo() + " má celkem: " + getTotalBalance() + "kč";
    }
    
    public abstract String getInfo();
}
