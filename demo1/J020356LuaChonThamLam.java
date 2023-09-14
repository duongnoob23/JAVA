
package demo1;

import java.util.Scanner;

public class J020356LuaChonThamLam {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n*9 < m || m==0) System.out.println("-1 -1");
        else
        {
            int m1=m;
            int[] a=new int[n];
            int[] b=new int[n];
            a[0]=1;
            m--;
            for(int i=n-1;i>=1;i--)
            {
                if(m>=9)
                {
                a[i]=9;
                m-=9;
                }else
                {
                a[i]=m;
                m=0;
                }
            }
            if(m>0) a[0]+=m;
          
            for(int i=0;i<n;i++)
            {
                if(m1>=9)
                {
                    b[i]=9;
                    m1-=9;
                }else
                {
                    b[i]=m1;
                    m1=0;
                }
            }
            for(int i=0;i<n;i++){
            System.out.print(a[i]);
            }
            System.out.print(" ");
            for(int i=0;i<n;i++)
            {
                System.out.print(b[i]);
            }
            
        }
        
    }
}
