package week04_arrayobjects;

import week01_firstobjects.Point;
import java.util.ArrayList;
import java.util.Scanner;

//pouziti objektu NShape
public class NShapeApp2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        NShape shape = new NShape();
        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        System.out.println("Zadej body:");
        double x, y;
        Point p;
        for(int i = 1; i <= n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            shape.addPoint(x, y);
        }
        
        double perimeter = shape.calculatePerimeter();
        System.out.println(perimeter);
        
        System.out.println(shape);
        ArrayList<Point> myPoints = shape.getPoints();
        myPoints.add(new Point(0,0));
        System.out.println(shape);
    } 
}
