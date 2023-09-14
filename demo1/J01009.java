
package demo;


import java.util.Scanner;

public class J01009 {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        long tong=1;
        long sum=1;
        for(int i=2;i<=n;i++)
        {
            sum *=i;
            tong+= sum;
            
        }
        System.out.println(tong);
        
    }
}
