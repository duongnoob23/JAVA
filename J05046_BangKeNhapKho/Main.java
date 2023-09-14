
package J05046_BangKeNhapKho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class SanPham {
    private String stt,ten;
    private long soLuong,donGia,chietKhau,thanhTien;
    
    public static HashMap<String,Integer> mp=new HashMap();
    public SanPham(String ten, long soLuong, long donGia) {
        
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.thanhTien = thanhTien;
        
        String[] a=ten.split("\\s+");
        stt=Character.toUpperCase(a[0].charAt(0))+""+Character.toUpperCase(a[1].charAt(0));
        
        if(mp.containsKey(stt)==true)
        {
            mp.put(stt, mp.get(stt)+1);
        }else
            {
                mp.put(stt, 1);
            }
       
        stt+=String.format("%02d", mp.get(stt));
        
        thanhTien=soLuong*donGia;
        
        if(soLuong >10) chietKhau=thanhTien*5/100;
        else if(soLuong>=8 && soLuong <=10) chietKhau=thanhTien*2/100;
        else if(soLuong>=5 && soLuong<8 ) chietKhau=thanhTien/100;
        else chietKhau=0;
        
       
    }

    public long getChietKhau() {
        return chietKhau;
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+chietKhau+" "+(thanhTien-chietKhau);
    }
    
    
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            SanPham moi=new SanPham(sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
            a.add(moi);
        
        }
        Collections.sort(a,new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Long.compare(o2.getChietKhau(), o1.getChietKhau());
            }
            
        });
        for(SanPham x:a)
        {
            System.out.println(x);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000

*/