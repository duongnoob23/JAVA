
package demo1;

import java.util.*;


public class J02022SoXaCach {
    public static Scanner sc=new Scanner(System.in);
    
    public static int n;
    public static int[] b;
    public static int[] a;
    
    public static void check(int a[])
    {
        for(int i=1;i<n;i++)
        {
            if((int)Math.abs( a[i] - a[i+1] )==1) 
            {
                return;
               
            }
        }
        
       for(int i=1;i<=n;i++)
        {
            System.out.print(a[i]); 
        }
        System.out.println(" ");
        
            
    }
   
        
    
    
    
    public static void ql(int i)
    {
        for(int j=1;j<=n;j++)
        {
            if(b[j]==0)
            {    
                b[j]=1;
                a[i]=j;
                if(i==n)
                    check(a);
                       
                else
                    ql(i+1);
                b[j]=0;
            }    
              
        }
    }
    
    public static void main(String[] args) {
       int t=sc.nextInt();
       while(t-->0)
       {
       n=sc.nextInt();
       b=new int[n+1];
       a=new int[n+1];
       ql(1);
       }
    }
}
