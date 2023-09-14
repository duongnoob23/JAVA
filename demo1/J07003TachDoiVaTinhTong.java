
package demo1;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003TachDoiVaTinhTong {
    
    //throws IOException
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(System.in);
        String s=sc.next();
            if(s.length()==1) System.out.println(s);
            while(true)
            {
            int n=s.length();
            if(n==1) break;
            String s1=s.substring(0, n/2);
            String s2=s.substring(n/2);
            BigInteger b1=new BigInteger(s1);
            BigInteger b2=new BigInteger(s2);
            BigInteger b3=b1.add(b2);
            s=b3.toString();
            System.out.println(s);
            }
            
    }
}
