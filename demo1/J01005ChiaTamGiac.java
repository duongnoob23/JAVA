
package demo;

import java.util.*;


public class J01005ChiaTamGiac {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0)
        {
            
            int b=sc.nextInt();
            int a=sc.nextInt();
            
            for(int i=1;i<b;i++)
            {
                System.out.printf("%.6f",Math.sqrt((1d*i)/b)*a);
                System.out.print(" ");
            }
             System.out.println();
                
        }
            
            
        
    }
}
