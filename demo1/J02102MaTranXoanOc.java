
package demo1;

import java.util.*;


public class J02102MaTranXoanOc {
   public static Scanner sc=new Scanner(System.in);
   
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        int[] b=new int[n*n];
        int[][] c=new int[n][n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                b[index]=a[i][j];
                index++;
            }
        }
        Arrays.sort(b);
        for(int i=0;i<n*n;i++) 
        {
            System.out.print(b[i]+" ");
        }
        int k=0;
        int h1=0,h2=n,l1=0,l2=n;
        while(h1<=h2 && l1<=l2)
        {
            for(int i=l1;i<l2;i++)
            {
                c[h1][i]=b[k];
                k++;
            }
            h1++;
            for(int i=h1;i<h2;i++)
            {
                c[i][l2]=b[k];
                k++;
            }
            l2--;
            for(int i=l2-1;i>=l1;i--)
            {
                c[h2][i]=b[l];
                k++;
            }
            h2--;
            for(int i=h2-1;i>=h1;i--)
            {
                c[i][l1]=b[k];
                k++;
            }
            h1++;
            
        }
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        
    }
}
