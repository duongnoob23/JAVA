
package demo1;
 
import java.math.BigInteger;
import java.util.Scanner;

public class J03015HieuSoNguyenLon2 {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
            BigInteger s1=sc.nextBigInteger();
            BigInteger s2=sc.nextBigInteger();
            BigInteger s3=s1.subtract(s2);
            
            System.out.println(s3);
            
        
    }
}
