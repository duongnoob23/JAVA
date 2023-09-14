
package demo;

import java.util.Scanner;


public class J01011BoiSoChungUocSoChung {
    public static Scanner sc = new Scanner(System.in);
    
    
    public static long UCLN(long a,long b)
    {
        while(a!=b)
        {
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }
    
    public static long BCNN(long  a,long b)
    {
        return a/UCLN(a,b)*b;
    }
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0)
        {
        
        long  n=sc.nextLong();
        long  m=sc.nextLong();
        
        System.out.print(BCNN(n,m)+ " ");
        System.out.println(UCLN(n, m));
    }
    }
}
