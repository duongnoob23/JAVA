
package J05034DanhSachThucTap_1;

public class SinhVien {
     private String stt,ma,ten,lop,email,cty;

    public SinhVien(String stt, String ma, String ten, String lop, String email, String cty) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.cty = cty;
    }
    
    public String getTen() {
        return ten;
    }
    
    public String getCty() {
        return cty;
    }
     
     @Override
    public String toString()
    {
        return stt+" "+ma+" "+ten+" "+lop+" "+email+" "+cty;
    }
}
