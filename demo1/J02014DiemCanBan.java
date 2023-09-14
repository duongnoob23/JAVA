
package demo1;

import java.util.Scanner;

public class J02014DiemCanBan {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int[] a=new int[n];
        long tong=0;
        long dem=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            tong+=a[i];
        }
        int ok=0;
        for(int i=0;i<n;i++)
        {
            dem+=a[i];
            if(dem-a[i]==tong-dem) 
            {
                System.out.println(i+1);
                ok=1;
                break;
            }
        }
        if(ok==0) System.out.println("-1");
        }
     }
            
} 
//   1 5 -2 5 2 2 0 
// 13