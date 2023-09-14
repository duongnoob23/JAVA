
package J05011_TinhGio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Time {
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
