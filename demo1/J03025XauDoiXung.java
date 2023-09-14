
package demo1;

import java.util.Scanner;


public class J03025XauDoiXung {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int dem=0;
            String s=sc.nextLine();
            int l=0,r=s.length()-1;
            while(l<=r)
            {
                if(s.charAt(l)!=s.charAt(r))
                {
                    dem++;
                  
                }
                l++;
                r--;
            }
            if((s.length()%2==0 && dem==1) || (s.length()%2==1 && dem<=1)) System.out.println("YES");
              else System.out.println("NO");
        }
        
    }
}



