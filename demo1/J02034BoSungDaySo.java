
package demo1;

import java.util.Scanner;

public class J02034BoSungDaySo {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        int big=0;
        int[] cnt=new int[1001];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            big=Math.max(big, a[i]);
            cnt[a[i]]=1;
        }
        int ok=0;
        for(int i=1;i<=big;i++)
        {
            if(cnt[i]==0)
            {
                ok=1;
                System.out.println(i);
            }
        }
        if(ok==0) System.out.println("Excellent!");
    }
}
