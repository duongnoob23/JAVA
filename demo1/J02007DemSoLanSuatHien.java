
package demo1;

import java.util.*;


public class J02007DemSoLanSuatHien {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int k=1;k<=t;k++)
        {
        int n=sc.nextInt();     
        int[] a=new int[n];      
        int[] cnt=new int[1000001];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            cnt[a[i]]++;
        }
            System.out.println("Test "+k+":");
        for(int i=0;i<n;i++)
        {
            if(cnt[a[i]]!=0)
            {
                System.out.println(a[i]+" xuat hien "+cnt[a[i]]+" lan");
                cnt[a[i]]=0;
            }
        }
        
        }
       
            
            
        
    }
}
