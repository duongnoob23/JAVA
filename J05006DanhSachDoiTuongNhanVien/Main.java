package J05006DanhSachDoiTuongNhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien {

    private String ma, ten, gt, ns, diaChi, sdt, n2;
    

    public NhanVien(String ma, String ten, String gt, String ns, String diaChi, String sdt, String n2) {
        this.ma =ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.n2 = n2;
    }
    
    public String getNam()
    {
        return ns.substring(6);
    }
    public String getThang()
    {
        return ns.substring(3, 5);
    }
    public String getNgay()
    {
        return ns.substring(0, 2);
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + ns  +" "+ diaChi + " " + sdt + " " + n2;
    }
    
    
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            NhanVien m = new NhanVien( String.format("%05d", i+1),sc.nextLine(), sc.nextLine()
                    , sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(m);
        }
        Collections.sort(a,new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
               if(o1.getNam().compareTo(o2.getNam())!=0)
               {
                   return o1.getNam().compareTo(o2.getNam());
               }else if(o1.getThang().compareTo(o2.getThang())!=0)
               {
                   return o1.getThang().compareTo(o2.getThang());
               }else
                   return o1.getNgay().compareTo(o2.getNgay());
            }
            
        });
        
        
        for(NhanVien x:a)
        {
            System.out.println(x);
        }

    }

    

}

/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011

*/
