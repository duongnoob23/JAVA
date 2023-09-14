
package J04018SoPhuc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.Math.*;


public class SoPhuc {
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
