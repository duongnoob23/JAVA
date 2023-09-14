
package J05081_DanhSachMatHang;



import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MatHang {
    private String ma,ten,donVi;
    private int giaMua,giaBan;

    public static int dem=0;
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
        return ma+" "+ten+" "+donVi+" "+giaMua+" "+giaBan+" "+getLoiNhuan();
    }
    
}



public class AMainn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int t=sc.nextInt();
        
        ArrayList<MatHang> a=new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            sc.nextLine();
            MatHang m=new MatHang("MH"+String.format("%03d", i),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
            a.add(m);
        }
        Collections.sort(a,new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
               if(o1.getLoiNhuan()!=o2.getLoiNhuan())
               {
                   return o2.getLoiNhuan()-o1.getLoiNhuan();
               }else
                   return o1.getMa().compareTo(o2.getMa());
               
            }
            
        });
        
        for(MatHang x:a)
        {
            System.out.println(x);
        }
}
}


/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/
