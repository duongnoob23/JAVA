
package demo1;

import java.util.Scanner;


public class J02035QuayPhai {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        
        
        long []a=new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        int dem=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1]){
                dem=i;
                break;
            }
        }
        System.out.println(dem);
        }
        
        
}}
