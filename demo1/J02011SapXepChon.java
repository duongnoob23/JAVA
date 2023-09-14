
package demo1;

import java.util.Scanner;

public class J02011SapXepChon {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++) a[i]=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int big=i;
            for(int j=i+1;j<=n;j++)
            {
                if(a[j]<a[big])
                {
                    big=j;
                }
            }
            int tmp=a[i];
            a[i]=a[big];
            a[big]=tmp;
            System.out.print("Buoc "+i+": ");
            for(int k=1;k<=n;k++)
        {
            System.out.print(a[k]+" ");
        }
            System.out.println();
        }
        
    }
}
