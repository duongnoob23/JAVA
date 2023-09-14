
package demo1;

import java.util.Scanner;

public class J03004ChuanHoaHoTen1 {
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
            for(int i=0;i<a.length;i++)
            {
                a[i]=solve(a[i]);
            }
            System.out.println(String.join(" ", a));
            
            
        }
    }
}
