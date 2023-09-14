
package demo1;

import java.util.Scanner;


public class J01010CatDoi {
    public static Scanner sc=new Scanner(System.in);
    public static long check(String s)
    {
        long n=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='0' || c=='8'|| c=='9')
            {
                n=n*10;
            }else if(c=='1')
            {
                n=n*10+1;
            }else
            {
                n=0;
                break;
            }
        }
        return n;
    }
        
    public static void main(String[] args) {
          int t=sc.nextInt();
          while(t-- >0)
          {
          String s=sc.next();
          long n=check(s);
          if(n==0) System.out.println("INVALID");
          else System.out.println(n);
          }
    }
}
