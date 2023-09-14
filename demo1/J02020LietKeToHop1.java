
package demo1;

import java.util.Scanner;

public class J02020LietKeToHop1 {
    public static Scanner sc=new Scanner(System.in);
    public static int n=sc.nextInt();
    public static int k=sc.nextInt();
    public static int[] a=new int[k+1];
    public static int dem=0;
    public static void in()
    {
        dem++;
        for(int i=1;i<=k;i++)
        {
            System.out.print(a[i]); 
        }
        System.out.print(" ");
    }
    
    public static void ql(int i)
    {
        for(int j=a[i-1]+1;j<=n-k+i;j++)
        {
            a[i]=j;
            if(i==k)
            {
                in();
            }else
                ql(i+1);
        }
    }
    
    
    public static void main(String[] args) {
        a[0]=0;
        ql(1);
        System.out.println("");
        System.out.println("Tong cong co "+dem+" to hop");
        
    }
            
}
