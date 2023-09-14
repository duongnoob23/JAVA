
package demo1;

import java.math.BigInteger;
import java.util.Scanner;


public class J03039ChiaHet {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine().trim();
            String[] a=s.split("\\s+");
            BigInteger s1=new BigInteger(a[0]);
            BigInteger s2=new BigInteger(a[1]);
            BigInteger s3=s1.max(s2);
            BigInteger s4=s1.min(s2);
            
            if(s3.remainder(s4)!=BigInteger.ZERO) System.out.println("NO");
            else System.out.println("YES");
            
        }
    }
}
