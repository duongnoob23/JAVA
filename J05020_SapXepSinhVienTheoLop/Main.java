
package J05020_SapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class SinhVien {
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
    
    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    
    @Override
    public String toString()
    {
        return ma+" "+ten+" "+lop+" "+mail;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            a.add(new SinhVien(ma, ten, lop, email));
        }
        
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0)
        {
            String s=sc.nextLine().toUpperCase();
            String[] c=s.split("\\s+");
            String res="DC";
            for(int i=0;i<2;i++)
            {
                res+=Character.toUpperCase(c[i].charAt(0));
            }
            
            System.out.println("DANH SACH SINH VIEN NGANH "+s+":");
            for(SinhVien x:a)
            {
                if(res.equals("DCCN")|| res.equals("DCAT"))
                {
                     if(x.getMa().contains(res) && !x.getLop().startsWith("E"))
                    {
                    System.out.println(x);
                    }       
                }else if(x.getMa().contains(res))
                {
                    System.out.println(x);
                }
                
            }
            
        }
   
    }
}



/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Ke toan
*/