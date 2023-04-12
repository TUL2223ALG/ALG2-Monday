package week02_fraction;

public class Fraction {
    private int citatel;
    private int jmenovatel;
    
    public Fraction (int citatel){
       this.citatel = citatel;
       jmenovatel = 1;
    }
    
    public Fraction (int citatel, int jmenovatel){
       if(jmenovatel == 0){
           throw new IllegalArgumentException("Jmenovatel nesmi byt 0.");
       }
       this.citatel = citatel;
       this.jmenovatel = jmenovatel;
       zakladniTvar();
    }
    
    public Fraction (String retezec) {
        String [] s = retezec.split("[ ]|[/]");
        this.citatel = Integer.parseInt(s[0]);
        this.jmenovatel = Integer.parseInt(s[1]);
        if(jmenovatel == 0){
           throw new IllegalArgumentException("Jmenovatel nesmi byt 0.");
       }
        zakladniTvar();
        //vybrat spolecne veci s predchozim konstruktorem do metody 
    }
    private void zakladniTvar(){
        int gcd = gcd(citatel, jmenovatel);
        citatel /= gcd;
        jmenovatel /= gcd;
    }
    
    public static int gcd(int num1, int num2){
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    /*
    public int gcd(){
        int num1 = this.citatel;
        int num2 = this.jmenovatel;
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }*/
    
    
    public int getCitatel() {
        return citatel;
    }
    
    public int getJmenovatel() {
        return jmenovatel;
    }
    
    public double getZlomek() {
        return citatel / (double)jmenovatel;
    }
    
    @Override
    public String toString() {
        if (jmenovatel != 1) {
            return citatel + "/" + jmenovatel;
        } else {
            //return Integer.toString(citatel);
            return "" + citatel;
        }
    }
}

