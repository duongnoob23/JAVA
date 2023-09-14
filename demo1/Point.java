import static java.lang.Math.*;
import java.util.Scanner;


public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
    
    public double getX()
    {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static double distance1(Point a,Point b)
    {
        return sqrt( pow(a.getX()-b.getX(),2)+pow(a.getY()-b.getY(),2) );
    }
    
    public double distance(Point a)
    {
        return sqrt( pow(x-a.x,2)+pow(y-a.y,2) );
    }
    
    
}
