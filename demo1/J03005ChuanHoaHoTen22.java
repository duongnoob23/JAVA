
package demo1;

import java.util.Scanner;

public class J03005ChuanHoaHoTen22 {
    public static Scanner sc=new Scanner(System.in);
    
    public static String solve(String s)
    {
        if(s.length()==1)
        {
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            
            String s=sc.nextLine().trim();
            String[] a=s.split("\\s+");
            for(int i=1;i<a.length;i++)
            {
                a[i]=solve(a[i]);
                System.out.print(a[i]);
                if(i!=a.length-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.print(", "+a[0].toUpperCase());
            System.out.println();
            
            
        }
    }
}
