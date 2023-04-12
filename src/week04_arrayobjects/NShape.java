package week04_arrayobjects;

import week01_firstobjects.Point;
import java.util.ArrayList;

public class NShape {
    private ArrayList<Point> points = new ArrayList();

    public NShape() {
    }
    
    public void addPoint(Point p){
       points.add(p); 
    }
    
    public void addPoint(double x, double y){
        Point p = new Point(x, y);
        points.add(p); 
    }
    
    public double calculatePerimeter(){
        double perimeter = 0;
        for(int i = 0; i < points.size()-1; i++){
            perimeter += points.get(i).distanceFrom(points.get(i+1));
        }
        //System.out.println(points.get(1).getX()); 
        perimeter += points.get(points.size() - 1).distanceFrom(points.get(0));
        return perimeter;
    }
    
    public Point getClosestPoint(){
        Point min = points.get(0);
        for (int i = 1; i < points.size(); i++) {
            if(min.distance() > points.get(i).distance())
            {
                min = points.get(i);
            }
        }
        return min;
    }
    
    public ArrayList<Point> getPoints() {
        return (ArrayList)points.clone();
    }

    @Override
    public String toString() {
        return "NShape{" + "points=" + points + '}';
    }
    
    
    
}
