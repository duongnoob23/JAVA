
package demo1;

import java.util.Scanner;


public class J02004MangDoiXung {

public static Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int [] p=new int[101];
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }
        int l=0,r=n-1;
        int ok=1;
        while(l<=r)
        {
            if(p[l]!=p[r])
            {
                ok=0;
                break;
            }
            l++;
            r--;
                
        }
        if(ok==1)System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
