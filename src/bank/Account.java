package bank;

/**
 *
 * @author 
 */
public class Account {
    private double balance = 0;

    public Account() {
    }
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public void addMoney(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } 
    }

    public double getBalance() {
        return balance;
    }
    

    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }
    
    
}
