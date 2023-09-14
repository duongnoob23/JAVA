
package demo1;

import java.util.*;


public class J03032DaoTu {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine().trim();
            String[] a=s.split("\\s+");
            for(int i=0;i<a.length;i++)
            {
                StringBuilder sb=new StringBuilder(a[i]);
                System.out.print(sb.reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
