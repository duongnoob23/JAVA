
package demo1;

import java.util.Scanner;

public class J03016ChiaHetCho11 {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
       int n=sc.nextInt();
       sc.nextLine();
       while(n-->0)
       {
           String s=sc.next();
           int mod=0;
           for(int i=0;i<s.length();i++)
           {
               mod =(mod*10)%11+ s.charAt(i)-'0'%11;
               mod%=11;
           }
           if(mod==0)
               System.out.println("1");
           else
               System.out.println("0");
           
       }
    }
}
