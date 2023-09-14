
package demo;

import java.util.Scanner;


public class J01017SoLIenKe {
    public static Scanner sc=new Scanner(System.in);
    
    public static boolean check(char a,char b)
    {
        int x=a-'0';
        int y=b-'0';
        return Math.abs(x-y)==2;
    }
    
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0)
        {
       String s=sc.next();
       int ok=1;
       long tong=s.charAt(0)-'0';
       for(int i=1;i<s.length();i++)
       {
           if(!check(s.charAt(i),s.charAt(i-1)))
           {
               ok=0;
               break;
           }
           tong+=s.charAt(i)-'0';
       }
            
       if(ok==1 && tong%10==0 )System.out.println("YES");
       else System.out.println("NO");
        
        }
        
    }
}
