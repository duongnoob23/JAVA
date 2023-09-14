
package J05003_DanhSachDoiTuongSinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class SinhVien  {
    private String ten,ma,ns,lop;
    private float gpa;
    
    public static int dem=1;

    public SinhVien() {
    }

    
    public SinhVien(String ten, String ma, String ns, float gpa) {
        this.ten = ten;
        this.ma = ma;
        this.ns = ns;
        this.gpa = gpa;
        this.lop = "B20DCCN"+String.format("%03d", dem++);
       
    }

    public float getGpa() {
        return gpa;
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
    
    public void chuanNs()
    {
        StringBuilder sb=new StringBuilder(ns);
        if(sb.charAt(1)=='/') sb.insert(0,'0');
        if(sb.charAt(4)=='/') sb.insert(3,'0');
        ns=sb.toString();
    }
     
     
    
    @Override
    public String toString()
    {
            return lop+" "+ten+" "+ma+" "+ns+" "+String.format("%.02f", gpa);
        
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        
        ArrayList <SinhVien> a=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine(); // Đọc tên
            String ma = sc.nextLine();  // Đọc mã
            String ns = sc.nextLine();  // Đọc ngày sinh
            float gpa = Float.parseFloat(sc.nextLine()); // Đọc GPA

            SinhVien m = new SinhVien(ten, ma, ns, gpa);
            m.chuanHoa();
            m.chuanNs();
            a.add(m);
        }
        Collections.sort(a,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Float.compare(o2.getGpa(), o1.getGpa());
            }
            
            
        });
        for(SinhVien x:a)
        {
            System.out.println(x);
        }
                  
       
    }
}