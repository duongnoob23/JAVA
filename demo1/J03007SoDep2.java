
package demo1;

import java.util.Scanner;


public class J03007SoDep2 {
    public static Scanner sc=new Scanner(System.in);
    public static boolean solve(String s)
    {
        if(s.charAt(0)!='8' || s.charAt(s.length()-1)!='8') return false;
        else
        {

        String res="";
        int tong=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            res+=s.charAt(i);
            tong+=s.charAt(i)-'0';
        }
        if(s.compareTo(res)==0 && tong%10==0) return true;
        return false;
        }
        
    }
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            if(solve(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
