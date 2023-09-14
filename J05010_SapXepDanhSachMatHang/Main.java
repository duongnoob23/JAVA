
package J05010_SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String stt,ten,nhom;
    private float mua,ban;
    
    public MatHang(String stt,String ten, String nhom, float mua, float ban) {
        this.stt = stt;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    
    public float getLoiNhuan()
    {
        return ban-mua;
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+nhom+" "+String.format("%.2f", getLoiNhuan());
    }
            
            
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <MatHang> a=new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            String stt=String.format("%1d", i);
            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            Float mua=Float.parseFloat(sc.nextLine());
            Float ban=Float.parseFloat(sc.nextLine());
            MatHang moi=new MatHang(stt,ten,nhom,mua,ban);
            a.add(moi);
            
        }
        
        Collections.sort(a,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return Float.compare(o2.getLoiNhuan(), o1.getLoiNhuan());
            }
            
        });
        for(MatHang x:a)
        {
            System.out.println(x);
        }
    }
}
/*


3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/