
package J05034DanhSachThucTap_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
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

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
     
     @Override
    public String toString()
    {
        return stt+" "+ma+" "+ten+" "+lop+" "+email+" "+cty;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String stt=String.format("%01d", i+1);
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            String cty=sc.nextLine();
            SinhVien moi=new SinhVien(stt,ma,ten,lop,email,cty);
            a.add(moi);
        }
        Collections.sort(a,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getLop().compareTo(o2.getLop());
            }
            
        });
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s=sc.nextLine();
            for(SinhVien x:a)
            {
                if(x.getCty().compareTo(s)==0)
                {
                    System.out.println(x);
                }
            }
        }
    }
}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
3
GAMELOFT
VIETTEL
FPT
*/