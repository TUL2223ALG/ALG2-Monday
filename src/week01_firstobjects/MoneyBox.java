package week01_firstobjects;

/**
 * Represents moneybox
 * @author 
 */
public class MoneyBox {
    
    private String name;
    //private int count1kc = 0;
    private int count1kc;
    private int count2kc;
    
    private final static int TWO = 2;
    
    public MoneyBox(String name){
        this.name = name;
        count1kc = 0;
        count2kc = 0;   
       
    }

    public MoneyBox(String name, int count1kc, int count2kc) {
        this.name = name;
        this.count1kc = count1kc;
        this.count2kc = count2kc;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getSum(){
        int sum = count1kc+count2kc*TWO;
       return sum;
    }
    
    public void addCount1kc(){
        count1kc++;
    }
    
    public void addCount2kc(){
        count2kc++;
    }
    
    public void addPocetkc(int kc, int dvoukc){
        count1kc = count1kc + kc;
        count2kc = count2kc + dvoukc;
        
    }
    @Override
    public String toString(){
        return String.format("%.f ma v pokladnicce %.f Kc - %.f x1Kc, %.f x2Kc.", name, getSum(),count1kc,count2kc);
    }
        
    public boolean isEnough(int present){
        return getSum()>= present;
    }

    public int getCount1kc() {
        return count1kc;
    }

    public int getCount2kc() {
        return count2kc;
    }
    
    public void withdraw(int kc, int dvakc){
        if(kc > count1kc || dvakc > count2kc){
            throw new IllegalArgumentException("Tolik korun nebo dvoukorun tam neni");
        }
        this.count1kc -= kc;
        this.count2kc -= dvakc;
    }
    
    public void withdraw(){
        this.count1kc = 0;
        this.count2kc = 0;
    }
    
    public void transfer(MoneyBox x){ //mam 2 instance this = bob, x = alice
        x.addPocetkc(this.count1kc, this.count2kc);
        this.count1kc = 0;
        this.count2kc = 0;
    }
}
