package week01_firstobjects;

/**
 * Represents a point in 2D
 * sablona pro @D body, novy datovy typ
 * @author 
 */
public class Point {
    //data - clenske promenne, atributy - stavy a vlastnosti (nemenne, menici se)
    private double x;
    private double y;
    
    //private double [] coord = new double[2];
    
    //konstruktor
    public Point(double x, double y){
       //this.coord[0] = x;
       //this.coord[1] = y;
       this.x = x;
       this.y = y;
    }
    
    //pretizeny overloaded konstruktor
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    //metody, ktere pracuji nad daty
    public double distance(){
       return Math.hypot(x, y);
       //return Math.sqrt(x*x + y*y);
       //return Math.hypot(coord[0], coord[1]);
    }
    
    public double distanceFrom(Point p){ //bod this, bod p
        return Math.hypot(this.x - p.x, this.y - p.y);
    }
    
    @Override 
    //prekryti (override) metody predka
    public String toString(){
        return String.format("x = %.2f: y = %.2f", x, y);
        //return String.format("x = %.2f, y = %.2f", coord[0], coord[1]);
    }
    
    //gettr
    public double getX() {
        return x;
    }
    /*
    //settr
    public void setX(double x){
        if(x > 0){
            this.x = x;
        }
    }
*/
    
    //testovaci main
    public static void main(String[] args) {
        Point pointA = new Point(3, 4);
        double result = pointA.distance();
        System.out.println(result);
        System.out.println(pointA);
    }
    
}
