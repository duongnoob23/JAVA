
package demo1;


import java.util.Scanner;

public class J02104DanhSachCanh {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
       
        int n=sc.nextInt();
        int[][] a=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a[i][j]==1 && i<j) System.out.println("("+i+","+j+")");
            }
        }
    }
}
