
package J05036TinhGiaBan_1;

import java.util.ArrayList;
import java.util.Scanner;


public class SanPham {
     private String stt,ten,donVi;
     private long giaNhap,soLuong;

    public SanPham(String stt, String ten, String donVi, long giaNhap, long soLuong) {
        this.stt = stt;
        this.ten = ten;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }
     
    public long getPVC()
    {
        return Math.round((double)(giaNhap*soLuong*5)/100);
    }
    public long getThanhTien()
    {
        return Math.round(giaNhap*soLuong+getPVC());
    }
    public long getGiaBan()
    {
        return (long)Math.ceil((double)((getThanhTien()+Math.round((double)(getThanhTien()*2))/100)/soLuong)/100)*100;
    }
     @Override
    public String toString()
    {
        return stt+" "+ten+" "+donVi+" "+getPVC()+" "+getThanhTien()+" "+getGiaBan();
    }
     
}
