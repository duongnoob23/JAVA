
package J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep {
    private String id,name;
    private int number;

    public DoanhNghiep(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }
    
    @Override
    public String toString()
    {
        return id+" "+name+" "+number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<DoanhNghiep> a=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            DoanhNghiep moi=new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            a.add(moi);
        }
        Collections.sort(a,new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getNumber()==o2.getNumber())
                {
                    return o1.getId().compareTo(o2.getId());
                }
                else
                    return o2.getNumber()-o1.getNumber();
            }
            
        });
        
           int t=sc.nextInt();
           
           while(t-->0)
            {
                int soLuong=sc.nextInt();
                int soLuong2=sc.nextInt();
                System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+soLuong+" DEN "+soLuong2+" SINH VIEN:");
                for(DoanhNghiep x:a)
                {
                    if(x.getNumber()>=soLuong &&  x.getNumber()<=soLuong2)
                        System.out.println(x);
                }
            }
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
1
30 50
*/