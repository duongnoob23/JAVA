
package demo;

import java.util.Scanner;


public class J01014UocSoNguyenToLonNhat {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int t1=1;t1<t+1;t1++)
        {
        long n=sc.nextLong();
        int s=0;
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            int dem=0;
            while(n%i==0)
            {
              dem++;
              n/=i;
              s=i;
              
            }
        }
        if(n!=1) System.out.println(n);
        else System.out.println(s);
    }
    }
}
