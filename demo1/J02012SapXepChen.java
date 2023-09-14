
package demo1;

import java.util.Scanner;

public class J02012SapXepChen {
   public static Scanner sc=new Scanner(System.in);
   
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.printf("Buoc 0: %d",a[0]);
        System.out.println();
        for(int i=1;i<n;i++)
        {
            int min=i-1,x=a[i];
            while(min >=0 && a[min]>x)
            {
                a[min+1]=a[min];
                min--;
            }
            a[min+1]=x;
            System.out.printf("Buoc %d: ",i);
            for(int k=0;k<=i;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
        
    }
}
