
package demo;

import java.util.Scanner;


public class J01021TinhLuyThua {   
    public static Scanner sc=new Scanner(System.in);
    public static final int MOD = (int)1e9+7;
    
    public static Long luythua(long a,long b)
    {
        if( b==0 ) 
        {
            return 1L;
        }
        if( b==1 ) 
        {
            return a%MOD;
        }
        long m=luythua(a,b/2);
        if(b%2==0) return (m*m)%MOD;
        return ((m*m)%MOD*a)%MOD;
    }
    
    public static void main(String[] args) {
        while(true)
        {
       long a=sc.nextLong();
       long b=sc.nextLong();
       if(a==0 && b==0) break;
        System.out.println(luythua(a, b));
        }
    }
            
}
