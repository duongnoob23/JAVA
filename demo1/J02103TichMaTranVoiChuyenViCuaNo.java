
package demo1;

import java.util.Scanner;


public class J02103TichMaTranVoiChuyenViCuaNo {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int t1=1;t1<=t;t1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n][m];
            int[][] b=new int[m][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                    b[j][i]=a[i][j];
                }
            }
            int[][] c=new int[n][n];
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<m;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                        
                }
                
            }
            System.out.println("Test "+t1+":");

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
                    
            }
                
                
        }
            
    }
}
