
package demo1;
 
import java.math.BigInteger;
import java.util.Scanner;

public class J03013HieuSoNguyenLon1 {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            BigInteger s1=sc.nextBigInteger();
            BigInteger s2=sc.nextBigInteger();
            BigInteger s3=s1.subtract(s2).abs();
            
            StringBuilder sb= new StringBuilder(s3.toString());
            int maxlen=Math.max(s1.toString().length(),s2.toString().length());
            while(sb.length()<maxlen)
            {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
            
        }
    }
}
