
package J04018SoPhuc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.Math.*;

class SoPhuc {
    private long nguyen,thuc;
    
    public SoPhuc() {
    }
    
    public SoPhuc(long nguyen, long thuc) {
        this.nguyen = nguyen;
        this.thuc = thuc;
    }
    
    public long getNguyen() {
        return nguyen;
    }

    public long getThuc() {
        return thuc;
    }
    
    public static SoPhuc add(SoPhuc a,SoPhuc b)
    {
        SoPhuc c=new SoPhuc();
        c.nguyen=a.nguyen+b.nguyen;
        c.thuc=a.thuc+b.thuc;
        return c;
        
    }
    public static SoPhuc mul(SoPhuc a,SoPhuc b)
    {
        SoPhuc c=new SoPhuc();
        c.nguyen=a.nguyen*b.nguyen-a.thuc*b.thuc;
        c.thuc=a.nguyen*b.thuc+a.thuc*b.nguyen;
        return c;
    }
    
    @Override
    public String toString()
    {
        String res=nguyen+"";
        if(thuc<0)
        {
            res+=" - ";
            thuc*=-1;
        }
        else res+=" + ";
        res+=thuc+"i";
        return res;
        
    }
    
    
    
}


public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        SoPhuc a=new SoPhuc(sc.nextLong(),sc.nextLong());
        SoPhuc b=new SoPhuc(sc.nextLong(),sc.nextLong());
        SoPhuc c1=SoPhuc.add(a, b);
        SoPhuc c=SoPhuc.mul(c1, a);
        SoPhuc d1=SoPhuc.mul(c1, c1);
        System.out.print(c);
        System.out.print(", ");
        System.out.println(d1);
        
        }
}
}
