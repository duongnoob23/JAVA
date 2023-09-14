
package demo1;

import java.util.*;

public class J02037DayUuThe {
    public static Scanner sc=new Scanner(System.in);
    public static void check(String a)
    {
        
    }
    
    
    public static void main(String[] args) {
        int t=sc.nextInt();
        sc.nextLine();  
        while(t-->0)
        {
            String s=sc.nextLine();
            String[] a=s.split("\\s+");
            int chan=0,le=0;
            for(String i: a)
            {
                if(i.charAt(i.length()-1)%2==0) chan++;
                else le++;
            }
            if( ( chan >le && a.length%2==0) || (chan < le && a.length%2==1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
            
}
