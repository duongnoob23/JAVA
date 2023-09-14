
package demo;

import java.util.Scanner;


public class J01024SoTamPhan {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0)
        {
        int n=sc.nextInt();
        int []a=new int[10];
        while(n>0)
        {
        a[n%10]=1;
        n/=10;
        }
        int tong=0;
        for(int i=0;i<10;i++)
        {
            tong+=a[i];
        }
        if( a[1]+a[0]+a[2]==tong ) System.out.println("YES");
        else System.out.println("NO");
    }}
    
}
