
package J05020_SapXepSinhVienTheoLop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
 public class SinhVien {
    private String ma,ten,lop,mail;

    public SinhVien(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public void chuanHoa()
    {
        String[] a=ten.trim().split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++)
            {
                res+=Character.toLowerCase(x.charAt(i));
            }
            res+=" ";
        }
        ten=res.trim();
    }
    public String getLop() {
        return lop;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString()
    {
        return ma+" "+ten+" "+lop+" "+mail;
    }
}
