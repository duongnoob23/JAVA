
package demo1;

import java.util.*;


public class J02016BoBaSoPPytago {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                long tmp=sc.nextLong();
                a[i]=tmp*tmp;
            }
            int ok=0;
            Arrays.sort(a);
            for(int i=n-1;i>=2;i--)
            {
                int l=i-1;
                int r=0;
                while(l>r)
                {
                    long mid=a[l]+a[r];
                    if(mid<a[i])
                    {
                       r++;
                    }else if(mid >a[i])
                    {
                        l--;
                    }else
                    {
                        ok=1;
                        break;
                    }
                }
                
            }
            if(ok==1)
            {
                System.out.println("YES");
            }else
                System.out.println("NO");
                
               
            
        }
    }
}
