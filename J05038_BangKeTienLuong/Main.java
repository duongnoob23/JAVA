
package J05038_BangKeTienLuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TienLuong {
    private String stt,ten;
    private int luong,ngayCong;
    private String chucVu;
    private int luongThang,thuong,phuCap,thucLinh;

    public TienLuong(String stt, String ten, int luong, int ngayCong, String chucVu) {
        this.stt = stt;
        this.ten = ten;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        
        luongThang=luong*ngayCong;
        if(ngayCong>=25) thuong=luongThang*20/100;
        else if(ngayCong>=22 && ngayCong <25) thuong=luongThang*10/100;
        else thuong=0;
        
        if(chucVu.equals("GD")) phuCap=250000;
        else if(chucVu.equals("PGD")) phuCap=200000;
        else if(chucVu.equals("TP")) phuCap=180000;
        else phuCap=150000;
        
        
        
    }

    public int getThucLinh() {
        return luongThang+thuong+phuCap;
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+luongThang+" "+thuong+" "+phuCap+" "+getThucLinh();
    }
    
    
    
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList <TienLuong> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String stt=String.format("NV%02d", i+1);
            String ten=sc.nextLine();
            int luong=Integer.parseInt(sc.nextLine());
            int ngayCong=Integer.parseInt(sc.nextLine());
            String chucVu=sc.nextLine();
            TienLuong moi=new TienLuong(stt,ten,luong,ngayCong,chucVu);
            
            a.add(moi);
        }
        Collections.sort(a,new Comparator<TienLuong>(){
            @Override
            public int compare(TienLuong o1, TienLuong o2) {
                return o2.getThucLinh()-o1.getThucLinh();
            }
            
        });
        for(TienLuong x:a)
        {
            System.out.println(x);
        }
        
    }
}
/*


3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
*/