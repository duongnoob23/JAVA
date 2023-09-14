
package demo1;

import java.util.Scanner;

public class J02027ThuGonDaySo {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
              
        int n=sc.nextInt();
        int[] a=new int[n];
        int m=n;
        int check=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i!=0)
            {
                check=a[i-1];
                if((check+a[i])%2==0)
                {
                    m--;
                    a[i]=check;
                }
            }
        }
        
        if(m<n) m--;
        System.out.println(m);
    }
}}
