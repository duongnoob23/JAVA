
package demo;

import java.util.Scanner;


public class J01008phanTichThuaSoNguyenTo {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int t1=1;t1<t+1;t1++)
        {
        int n=sc.nextInt();
     
        System.out.print("Test "+t1+": ");
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            int dem=0;
            while(n%i==0)
            {
              dem++;
              n/=i;
              
              if(n%i!=0) System.out.print(i +"(" +dem+")"+ " ");
            }
        }
        if(n!=1) System.out.print(n+"(1)");
        System.out.println("");
    }
    }
}
