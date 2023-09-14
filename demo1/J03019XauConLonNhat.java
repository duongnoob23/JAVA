
package demo1;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class J03019XauConLonNhat {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String s=sc.next();
        String res="";
        Character k='a';
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)>=k)
            {
                k=s.charAt(i);
                res=s.charAt(i)+res;
            }
        }
        System.out.println(res);
        
        
        
    }
            
}
