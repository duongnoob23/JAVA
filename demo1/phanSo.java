import static java.lang.Math.*;
import java.util.Scanner;
import java.math.*;


public class phanSo {
    private long a,b;

    private long gcd(long a,long b)
    {
        while(a*b!=0)
        {
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    
    public phanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a/gcd(a,b);
    }

    public long getB() {
        return b/gcd(a,b);
    }
    
    public void display()
    {
        System.out.println( a/gcd(a,b)+"/"+b/gcd(a,b));
    }
    
}
