
package demo;

import java.util.Scanner;


public class hinhChuNhat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a <=0 || b<=0)
        {
            System.out.println(0);
        }else
        {
        System.out.print((a+b)*2+" ");
        System.out.println(a*b);
        }
    }
}
