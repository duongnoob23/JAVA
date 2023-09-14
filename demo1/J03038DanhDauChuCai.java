
package demo1;

import java.util.*;


public class J03038DanhDauChuCai {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        String s=sc.nextLine();
        HashSet <Character> set =new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
                 
    }
}
