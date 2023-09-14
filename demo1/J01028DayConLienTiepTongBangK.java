
package demo1;

import java.util.Scanner;


public class J01028DayConLienTiepTongBangK {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        long m=sc.nextLong();
        
        int []a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(m==0)
        {
            System.out.println("NO");
        }
        
        else
        {
            
        long tong=0;
        int index=0;
        int ok=0;
        for(int i=0;i<n;i++)
        {   
                
            tong+=a[i];
            while(tong>m && index<i)
            {
                tong-=a[index];
                index++;
                
            }
            if(tong==m) ok=1;
            
        }
        if(ok==1 )
        {
            System.out.println("YES");
        }else
            System.out.println("NO");
        }
        }
}
}
