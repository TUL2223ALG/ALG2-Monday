package week03_polynom;

import java.util.Arrays;


public class Polynom {
    private double[] coef; //2x^4 - 4 [-4,0,0,0,2]
    
    private Polynom(double [] coef){
        this.coef = coef;
    }
    
    //tovarni factory method
    public static Polynom getInstanceFromNormal(double [] normalCoef){ //[2,0,0,0,-4]
        double[] newCoef = Arrays.copyOf(normalCoef, normalCoef.length);
        double temp;
        for (int i = 0; i < newCoef.length/2; i++) {
            temp = newCoef[i];
            newCoef[i] = newCoef[newCoef.length - 1 - i];
            newCoef[newCoef.length - 1 - i] = temp;
        }
        return new Polynom(newCoef);
    }
    
    public static Polynom getInstanceFromReverted(double [] reversedCoef){//[-4,0,0,0,2]    
        return new Polynom(Arrays.copyOf(reversedCoef, reversedCoef.length)); //defenzivni kopie
    }
}
