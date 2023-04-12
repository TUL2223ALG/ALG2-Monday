package week02_fraction;

import java.util.Scanner;

public class FractionApp {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 35;
        int y = 60;
        Fraction a = new Fraction("6 -9");
        x=a.getCitatel();
        y=a.getJmenovatel();
        System.out.println(x+" "+y);
        System.out.println(a);
    }
    
}
