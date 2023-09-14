
package demo1;

import java.util.Scanner;


public class J02106MaTranNhiPhan {
   public static Scanner sc=new Scanner(System.in);
   
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        int dem=0;
        for(int i=0;i<n;i++)
        {
            int chan=0;
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]==1) chan++; 
            }
            if(chan > 3-chan-1) dem++;
        }
        System.out.println(dem);
            
    }
           
}
