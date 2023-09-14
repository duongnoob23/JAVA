
package demo;

import java.util.Scanner;


public class J01025HinhVuong {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int max1=Math.max(Math.max(a,a1),Math.max(x,x1));
        int min1=Math.min(Math.min(a,a1),Math.min(x,x1));
        int max2=Math.max(Math.max(b,b1),Math.max(y,y1));
         int min2=Math.min(Math.min(b,b1),Math.min(y,y1));
        
        int max=Math.max(max2-min2, max1-min1);
        System.out.println(max*max);
    }
}
