
package demo1;

import java.util.Scanner;


public class J03008SoDep3 {
    public static Scanner sc=new Scanner(System.in);
    public static boolean solve(String s)
    {       
        String res="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            res+=s.charAt(i);
            if(s.charAt(i)!='2' && s.charAt(i)!='3' && s.charAt(i)!='5' && s.charAt(i)!='7') return false;
        }
        if(s.compareTo(res)==0 ) return true;
        return false;
        
        
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
