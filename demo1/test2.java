
package demo1;

import java.util.Scanner;

public class test2 {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String s=sc.nextLine();
        
        String s1=s.substring(0,2);
        String s2=s.substring(3);
        
        
        int s11=Integer.parseInt(s1);
        int s22=Integer.parseInt(s2);
        int s3=s11*60+s22;
        String s4=s3/60 +"gio"+s3%60+"phut";
        System.out.println(s3);
    }
}
//09:00