package J05006DanhSachDoiTuongNhanVien;

import java.util.Scanner;

public class NhanVien {

    private String ma, ten, gt, ns, diaChi, sdt, n2;
    

    public NhanVien(String ma, String ten, String gt, String ns, String diaChi, String sdt, String n2) {
        this.ma =ma;
        this.ten = ten.trim();
        this.gt = gt;
        this.ns = ns;
        this.diaChi = diaChi.trim();
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
