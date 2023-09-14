
package demo1;

import java.util.*;

public class J02027KhoangCachNhoHonK {
    public static Scanner sc=new Scanner(System.in);
    public static int find(int i,int j,int k,int a[])
    {
        int res=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]<k)
            {
                res=mid;
                i=mid+1;
            }else
                j=mid-1;
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
            
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        long cnt=0;
        for(int i=0;i<n;i++)
        {
            int kq=m+a[i];
            if(find(i+1,n-1,kq,a)!=-1)
            {
                cnt+=find(i+1,n-1,kq,a)-i;
            }
            
            
        }
        System.out.println(cnt);
     }}
            
}
