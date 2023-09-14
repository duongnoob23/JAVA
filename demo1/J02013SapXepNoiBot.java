
package demo1;

import java.util.Scanner;

public class J02013SapXepNoiBot {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           int ok=1;
           for(int j=0;j<n-i-1;j++)
           {
               if(a[j]>a[j+1])
               {    
                   ok=0;
                   int tmp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=tmp;
               }
           }
           if(ok==1)
           {
               break;
           }else
           {
               System.out.printf("Buoc %d: ",i+1);

               for(int k=0;k<n;k++)
               {
                   System.out.print(a[k]+" ");
               }
               System.out.println();
           }
           
       }
    }
    
}
        


