
package demo1;


import java.util.*;

public class J03040BienSoDep {
    public static Scanner sc=new Scanner(System.in);
    
    public static boolean check1(int[] a)
    {
        for(int i=1;i<5;i++)
        {
            if(a[i]<=a[i-1]) return false;
        }
        return true;
    }
   
    public static boolean check2(int[] a)
    {
        return (a[0]==a[1] && a[1]==a[2] && a[3]==a[4]) ;
        
        
    }
    public static boolean check3(int[] a)
    {
        for(int i=1;i<5;i++)
        {
            if(a[i]!=a[0]) return false;
        }
        return true;
    }
    public static boolean check4(int[] a)
    {
        for(int i=0;i<5;i++)
        {
            if(a[i]!=6 && a[i]!=8) return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.next();
//            System.out.println(s);
//            System.out.println(s.charAt(5));
            int[] a=new int[5];
            a[0]=s.charAt(5)-'0';
            a[1]=s.charAt(6)-'0';
            a[2]=s.charAt(7)-'0';
            a[3]=s.charAt(9)-'0';
            a[4]=s.charAt(10)-'0';
            if(check1(a) || check2(a) || check3(a) || check4(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
