
package demo;

import java.util.Scanner;

public class J01016ChuSo4vaChuSo7 {
       public static Scanner sc=new Scanner(System.in);
       
       
       public static void main(String[] args) {
         long n=sc.nextLong();
         
         
         long dem4=0;
         long dem7=0;
         while(n>0)
         {
             long t=n%10;
             if(t==4) dem4++;
             else if(t==7) dem7++;
             n/=10;
         }
           if(dem4+dem7==4|| dem4+dem7==7)
           {
               System.out.println("YES");
           }else
               System.out.println("NO");
         
    }
}
