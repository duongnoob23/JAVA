
package J05036TinhGiaBan_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
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


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String stt=String.format("MH%02d", i+1);
            String ten=sc.nextLine();
            String donVi=sc.nextLine();
            long giaNhap=Long.parseLong(sc.nextLine());
            long soLuong=Long.parseLong(sc.nextLine());
            SanPham moi=new SanPham(stt,ten,donVi,giaNhap,soLuong);
            a.add(moi);
        }
        Collections.sort(a,new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Long.compare(o2.getGiaBan(),o1.getGiaBan());
            }
            
        });
        for(SanPham x:a)
        {
            System.out.println(x);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430

*/