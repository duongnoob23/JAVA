
package demo1;

import java.util.*;


public class J02008BoiSoNhoNhatCuaNSoNguyenDuongDauTIen {
    public static Scanner sc =new Scanner(System.in);
    
    public static long ucln(long a,long b)
    {
        while(a*b!=0)
        {
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
        
    }
    
    public static long lcm (long a,long b)
    {
        return a/ucln(a,b)*b;
    }
    
    public static void main(String[] args) {
        long t=sc.nextLong();
        while(t-->0)
        {
        long n=sc.nextLong();
        long res=1;
        
        for(long i=2;i<=n;i++)
        {
            res=lcm(res,i);
        }
        System.out.println(res);
        }
    }
}
