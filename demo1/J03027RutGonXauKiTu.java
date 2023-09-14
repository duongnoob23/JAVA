
package demo1;

import java.util.*;

public class J03027RutGonXauKiTu {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String s=sc.nextLine().trim();
        s+="!";
        StringBuilder sb=new StringBuilder(s);     
        for(int i=0;i<sb.length()-1;i++)
        {
            
            if(sb.charAt(i)==sb.charAt(i+1))
            {
                
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                i=-1;
                
               // System.out.println(sb.toString());
            }
           
        }
        sb.deleteCharAt(sb.length()-1);
        if(sb.toString().length()==0) System.out.println("Empty String");
        else System.out.println(sb.toString());
        
    }
}
