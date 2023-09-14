
package demo;

import java.util.Scanner;
as

public class J01012UocSOChiaHetCHo2 {
    public static Scanner sc=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0)
        {
        long n=sc.nextLong();
        int dem=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) 
            {
              if(i%2==0) dem++;
              if((n/i)%2==0)dem++;
               
            }
            
            
        }
        if(Math.sqrt(n)*Math.sqrt(n)==n && Math.sqrt(n)%2==0 && dem>0) dem--;
        System.out.println(dem);
    }
    }
}
