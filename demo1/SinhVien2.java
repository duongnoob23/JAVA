import static java.lang.Math.*;
import java.util.Scanner;

public class SinhVien2 {
    private String ten,id,ns;
    private double gpa;

    public SinhVien2(String ten, String id, String ns, double gpa) {
        this.ten = ten;
        this.id = id;
        this.ns = ns;
        this.gpa = gpa;
    }
    
    public void chuanHoa()
    {
        String[] a=ten.split("\\s+");
        String res="";
        for(String x : a)
        {
            res+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++)
            {
                res+=Character.toLowerCase(x.charAt(i));
            }
            res+=" ";
        }
        ten=res.trim();
    }
    
    public void chuanHoa2()
    {
        StringBuilder sb=new StringBuilder(ns);
        if(sb.charAt(1)=='/') sb.insert(0, '0');
        if(sb.charAt(4)=='/') sb.insert(3,'0');
        ns=sb.toString();
    }
    
    
    public void display()
    {
        System.out.print("B20DCCN001 "+ten+" "+id+" "+ns+" ");
        System.out.printf("%.1f",gpa);
    }
}
