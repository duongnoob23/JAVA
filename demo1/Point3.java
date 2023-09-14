import java.util.Scanner;
import static java.lang.Math.*;
 class Point3 {
    private double x,y;

    public Point3(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point3 a)
    {
        return sqrt(pow(x-a.x,2)+pow(y-a.y,2));
    }
}
//public class AMainn {
//    public static Scanner sc=new Scanner(System.in);
//    
//    public static void main(String[] args) {
//        int t=sc.nextInt();
//        
//        while(t-->0)
//        {
//            
//        
//        Point3 x=new Point3(sc.nextDouble(),sc.nextDouble());
//        Point3 y=new Point3(sc.nextDouble(),sc.nextDouble());
//        Point3 z=new Point3(sc.nextDouble(),sc.nextDouble());
//        
//        double a=x.distance(y);
//        double b=y.distance(z);
//        double c=z.distance(x);
//        double m=1/4f*sqrt( (a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c) );
//        double r=(a*b*c)/(4*m);
//        if( a + b > c && b + c > a && a + c > b)
//        {
//            System.out.printf("%.3f\n",r*r*Math.PI);
//        }else
//            System.out.println("INVALID");
//        
//    }}
//}

