
package demo1;

import java.util.*;

public class J02017ThuGonDaySo {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=sc.nextInt();
        List <Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        while(true)
        {
            int ok=1;
            for(int i=0;i<a.size()-1;i++)
            {
                if( (a.get(i)+a.get(i+1))%2==0 )
                {
                    a.remove(i+1);
                    a.remove(i);
                    i--;
                    ok=0;
                }
            }
            if(ok==1)
            {
                System.out.println(a.size());
                break;
            }
        }
        
    }
}
