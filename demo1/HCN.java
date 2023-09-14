import static java.lang.Math.*;
import java.util.*;


 class HCN {
    private double width,height;
    private String color;

    public HCN() {
    }

    
    
    public HCN(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public String getColor()
    {
        return color.substring(1, 2).toUpperCase()+color.substring(2).toLowerCase();
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double chuVi()
    {
        return 2*(width+height);
    }
    
    public double dienTich()
    {
        return width*height;
    }
    

    public void display()
    {
        System.out.println((int)chuVi()+" "+ (int)dienTich()+" "+getColor());
    }
}
