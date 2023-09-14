
package demo;

import java.util.Scanner;


public class J01026SoChinhPhuong {
    public static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args) {
       int t=sc.nextInt();
    while(t-- > 0)
    { 
        long n=sc.nextLong();
        long m=(long)Math.sqrt(n);
        
        if(m*m==n)System.out.println("YES");
        else System.out.println("NO");
    }
    }
}
