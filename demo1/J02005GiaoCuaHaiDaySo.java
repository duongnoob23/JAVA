
package demo1;

import java.util.*;


public class J02005GiaoCuaHaiDaySo {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] cnt=new int[10001];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            cnt[a[i]]=1;
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
            
        }
        Arrays.sort(b);
        
        for(int i=0;i<m;i++)
        {
            if(cnt[b[i]]==1)
            {
                System.out.print(b[i]+" ");
                cnt[b[i]]++;            
            }
        }
            
            
        
    }
}
