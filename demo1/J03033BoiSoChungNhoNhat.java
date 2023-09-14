
package demo1;

import java.math.BigInteger;
import java.util.*;

public class J03033BoiSoChungNhoNhat {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            BigInteger s1=sc.nextBigInteger();
            BigInteger s2=sc.nextBigInteger();
            System.out.println((s1.multiply(s2).divide(s1.gcd(s2))));
        }
    }
}
