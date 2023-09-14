
package demo1;

import java.util.Scanner;


public class J03026XauKhacNhauDaiNhat {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            String s1=sc.nextLine();
            if(s.length()!=s1.length()) System.out.println(Math.max(s.length(),s1.length()));
            else
            {
                if(s.compareTo(s1)==0) System.out.println(-1);
                else System.out.println(s.length());
            }
        }
        
    }
}



