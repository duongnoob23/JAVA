
package J05011_TinhGio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time {
    private String ma,ten,vao,ra;

    public Time(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
    }

    
    
    public String gioChoi()
    {
        int gioVao=Integer.parseInt(vao.substring(0, 2))*60 + Integer.parseInt(vao.substring(3));
        int gioRa=Integer.parseInt(ra.substring(0, 2))*60 + Integer.parseInt(ra.substring(3));
//        System.out.println(gioVao+" "+gioRa);
        String gioChoi= (gioRa-gioVao)/60+" gio "+(gioRa-gioVao)%60+" phut";
        return gioChoi;
     
    }
    
    public int get()
    {
        int gioVao=Integer.parseInt(vao.substring(0, 2))*60 + Integer.parseInt(vao.substring(3));
        int gioRa=Integer.parseInt(ra.substring(0, 2))*60 + Integer.parseInt(ra.substring(3));
        int thoiGianChoi=gioRa-gioVao;
        return thoiGianChoi;
    }
    
    
    @Override
    public String toString()
    {
        return ma+" "+ten+" "+gioChoi();
        
    }
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Time> a=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            Time moi=new Time(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(moi);
        }
        Collections.sort(a,new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                return o2.get()-o1.get();
            }
            
        });
        for(Time x:a)
        {
            System.out.println(x);
        }
                
    }
}
/*

3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/