
package demo1;

import java.math.BigInteger;
import java.util.Scanner;


public class J03011UocSoChungLonNhatCuaSoNguyenLon {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            BigInteger num1= new BigInteger(s1);
            BigInteger num2= new BigInteger(s2);
            System.out.println(num1.gcd(num2));
           
        }
    }
}
