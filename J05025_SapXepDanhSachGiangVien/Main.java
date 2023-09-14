package J05025_SapXepDanhSachGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GiangVien {
    private String id,ten,chuyenNganh;

    public GiangVien(String id, String ten, String chuyenNganh) {
        this.id = id;
        this.ten = ten;
        this.chuyenNganh = chuyenNganh;
    }

    public String getTen() {
       return ten;
    }
    
    

    public String getId() {
        return id;
    }
    
    public String getChuyenNganh()
    {
        String[] a=chuyenNganh.split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=Character.toUpperCase(x.charAt(0));
        }
        return res;
    }
    
    @Override
    public String toString()
    {
        return id+" "+ten+" "+getChuyenNganh();
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {

            GiangVien moi = new GiangVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine());
            a.add(moi);
        }

        int t1=Integer.parseInt(sc.nextLine());
        
        while (t1-->0) {
            
            String s = sc.nextLine();        
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            s=s.toLowerCase();
            
            for(GiangVien x:a)
            {
                if(x.getTen().toLowerCase().contains(s))
                {
                    System.out.println(x);
                }
            }

        }
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN


 */
