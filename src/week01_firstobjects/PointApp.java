package week01_firstobjects;

import java.util.Scanner;

public class PointApp {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej souradnice bodu");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point pointA = new Point(x, y);
        double result = pointA.distance();
        System.out.format("Vzdalenost od pocatku je %.2f%n", result);
        
        System.out.println("Zadej dalsi bod");
        Point pointB = new Point(sc.nextDouble(), sc.nextDouble());
        System.out.println(pointB.distance());
        System.out.println(pointB);
        System.out.println(pointB.getX());
        //pointB.setX(-7);
        System.out.println(pointB);
        
        Point pointC = new Point();
        System.out.println(pointC);
    }
    
}
