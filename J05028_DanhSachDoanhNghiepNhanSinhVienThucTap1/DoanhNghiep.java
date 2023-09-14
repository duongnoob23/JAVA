
package J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;
import java.util.Scanner;

public class DoanhNghiep {
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
