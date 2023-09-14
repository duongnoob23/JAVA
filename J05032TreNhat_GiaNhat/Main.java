
package J05032TreNhat_GiaNhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TuoiTho {
    private String ten,name,day,mon,year;

    public TuoiTho(String ten) {
        this.ten = ten;
       
        
        String[] a=ten.split("\\s+");
        name=a[0];
        day=a[1].substring(0,2);
        mon=a[1].substring(3,5);
        year=a[1].substring(6);
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getMon() {
        return mon;
    }

    public String getYear() {
        return year;
    }
   
    
    //11/08/2003
    @Override
    public String toString()
    {
        return name;
    }
    
    
}

 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<TuoiTho> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            TuoiTho moi=new TuoiTho(sc.nextLine());
            a.add(moi);
        }
        Collections.sort(a, new Comparator<TuoiTho>(){
            @Override
            public int compare(TuoiTho o1, TuoiTho o2) {
                if(o1.getYear().compareTo(o2.getYear())!=0)
                {
                    return o2.getYear().compareTo(o1.getYear());
                }
                else if(o1.getMon().compareTo(o2.getMon())!=0)
                {
                    return o2.getMon().compareTo(o1.getMon());
                }
                else
                    return o2.getDay().compareTo(o1.getDay());
            }
            
        });
        System.out.println(a.get(0));
        System.out.println(a.get(a.size()-1));
    }
    
    
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/