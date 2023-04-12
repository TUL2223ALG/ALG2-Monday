package week01_firstobjects;

public class MoneyBoxApp {
    
    public static void main(String[] args) {
        MoneyBox a = new MoneyBox("Alice", 20, 5);
        MoneyBox b = new MoneyBox("Bob", 10, 3);
        
        //b.setName("Alice");
        System.out.println(a.getSum());
        System.out.println(b.getSum());
        //a.addPocetkc(b.getCount1kc(), b.getCount2kc());
        //b.withdraw();
        b.transfer(a);
        System.out.println(a.getSum());
        System.out.println(b.getSum());
        
        b.withdraw(2, 2); //vyhodi vyjimku

    }   
}
