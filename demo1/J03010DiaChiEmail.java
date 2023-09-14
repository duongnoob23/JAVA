
package demo1;

import java.util.*;
import java.util.Scanner;

public class J03010DiaChiEmail {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        ArrayList <String> cnt = new ArrayList<>();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine().trim();
            String[] a=s.split("\\s+");
            String res="";
            res+=a[a.length-1].toLowerCase();
            for(int i=0;i<a.length-1;i++)
            {
                a[i]=a[i].toLowerCase();
                res+=a[i].charAt(0);
                
            }
            cnt.add(res);
            int dem=Collections.frequency(cnt,res);
            if(dem==1)
            {
                System.out.println(res+"@ptit.edu.vn");
            }else
            {
                System.out.println(res+dem+"@ptit.edu.vn");
            }
            
        }
    }
}
