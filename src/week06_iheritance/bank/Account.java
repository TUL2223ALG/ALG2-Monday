package week06_iheritance.bank;

public class Account {
    //cislo uctu
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
        //dat vedet ze se nepovedlo
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
