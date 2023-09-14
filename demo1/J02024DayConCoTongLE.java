
package demo1;

import java.util.*;
import java.util.TreeSet;

public class J02024DayConCoTongLE {
    public static Scanner sc=new Scanner(System.in);
    public static int n;
    public static int[] a=new int[100];
    public static int[] b=new int[100];
    public static TreeSet<String> ts = new TreeSet<>();   
    public static void in()
    {
        int tong=0;
        String res="";
        for(int i=0;i<n;i++)
        {
            if(b[i]==1)
            {
                tong+=a[i];
                res=a[i]+" "+res;
            }
        }
        if(tong%2==1)
        {
            ts.add(res);
        }
    }  
    public static void ql(int i)
    {
        for(int j=0;j<=1;j++) 
        {
            b[i]=j;
            if(i==n)
            {
                in();
            }else
                ql(i+1);
        }
    }
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
        n=sc.nextInt();
        for (int i=0;i<n;i++) a[i]=sc.nextInt();
        
        ql(0);       
        for(String x:ts)
        {
            System.out.println(x);
        }
        ts.clear();
        }
    }
}
