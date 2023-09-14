
package J05043_TinhThuNhapChoGiaoVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien {
    private String stt,ten,chucVu;
    private long luong,ngayCong,phuCap,luongChinh,tamUng,conLai,thuNhap;

    public NhanVien(String stt,String ten, String chucVu, long luong, long ngayCong) {
        this.stt=stt;
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
        
        if(chucVu.equals("GD")) phuCap=500;
        else if(chucVu.equals("PGD")) phuCap=400;
        else if(chucVu.equals("TP")) phuCap=300;
        else if(chucVu.equals("KT")) phuCap=250;
        else phuCap=100;
        
        luongChinh=luong*ngayCong;
        long a=((luongChinh+phuCap)*2)/3;
        if((phuCap+luongChinh)*2/3<25000) tamUng=(long)Math.round((double)a/1000)*1000;
        else tamUng=25000; 
        
        conLai=luongChinh-tamUng+phuCap;
        thuNhap=luongChinh+phuCap;
    }

    public long getThuNhap() {
        return thuNhap;
    }
    
    public String getChucVu() {
        return chucVu;
    }

    public String getStt() {
        return stt;
    }


    public long getLuong() {
        return luong;
    }


    public long getLuongChinh() {
        return luongChinh;
    }

    

    public long getConLai() {
        return conLai;
    }
    
    
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+phuCap+" "+luongChinh+" "+tamUng+" "+conLai;
    }
    
        
        

}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            
            NhanVien moi=new NhanVien(String.format("NV%02d", i+1),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            a.add(moi);
        }
        
        Collections.sort(a,new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                
                    return Long.compare(o2.getThuNhap(), o1.getThuNhap());
                
            }
            
        });
        for(NhanVien x:a)
        {
            System.out.println(x);
        }
    }
}
/*




*/