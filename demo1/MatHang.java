import java.util.Scanner;
import static java.lang.Math.*;
public class MatHang {
    private String ma,ten,donVi;
    private int giaMua,giaBan;

    public MatHang(String ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public int getLoiNhuan()
    {
        return giaBan-giaMua;
    }

    public String getMa() {
        return ma;
    }
    
    
    
    public MatHang(String ma) {
        this.ma = ma;
    }
    
    @Override
    public String toString()
    {
        return ma+" "+ten+" "+donVi+" "+giaBan+" "+giaMua+" "+getLoiNhuan();
    }
    
}
