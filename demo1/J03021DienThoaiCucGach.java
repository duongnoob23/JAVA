
package demo1;

import java.util.*;

public class J03021DienThoaiCucGach {
    public static Scanner sc=new Scanner(System.in);
    
    
    
    public static boolean solve(String s)
    {
        String res="";
        String res1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='C')
            {
                res=res+"2";
                res1="2"+res1;
            }
            else if(s.charAt(i)>='D' && s.charAt(i)<='F')
            {
                res=res+"3";
                res1="3"+res1;
            }
            else if(s.charAt(i)>='G' && s.charAt(i)<='I')
            {
                res=res+"4";
                res1="4"+res1;
            }
            else if(s.charAt(i)>='J' && s.charAt(i)<='L')
            {
                res=res+"5";
                res1="5"+res1;
            }
            else if(s.charAt(i)>='M' && s.charAt(i)<='O')
            {
                res=res+"6";
                res1="6"+res1;
            }
            else if(s.charAt(i)>='P' && s.charAt(i)<='S')
            {
                res=res+"7";
                res1="7"+res1;
            }
            else if(s.charAt(i)>='T' && s.charAt(i)<='V')
            {
                res=res+"8";
                res1="8"+res1;
            }
            else if(s.charAt(i)>='W' && s.charAt(i)<='Z')
            {
                res=res+"9";
                res1="9"+res1;
            }
            
        }
        
        
        if(res.compareTo(res1)==0) return true;
        else return false;
    }
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine().trim().toUpperCase();
            
            if(solve(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
