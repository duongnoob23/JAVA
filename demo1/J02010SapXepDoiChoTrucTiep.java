
package demo1;

import java.util.Scanner;


public class J02010SapXepDoiChoTrucTiep {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            int ok=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    ok=1;
                    int tmp=a[j];
                    a[j]=a[i];
                    a[i]=tmp;
                }
            }
            if(ok==1)
            {
                System.out.printf("Buoc %d: ",i+1);
            for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
            }else
                break;
        }
       
    }
}
