
import java.util.Scanner;


 class NhanVien {
    private String ten,gioiTinh,day1,diaChi,sdt,day;

    public NhanVien(String ten, String gioiTinh, String day1, String diaChi, String sdt, String day) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.day1 = day1;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.day = day;
    }
    
    public void chuanHoa()
    {
        String[] a=ten.split("\\s+");
        String res="";
        for(String x : a)
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
    
    public void chuanHoa2()
    {
        StringBuilder sb=new StringBuilder(day1);
        if(sb.charAt(1)=='/') sb.insert(0, '0');
        if(sb.charAt(4)=='/') sb.insert(3,'0');
        day1=sb.toString();
    }
    
    public void chuanHoa3()
    {
        StringBuilder sb=new StringBuilder(day);
        if(sb.charAt(1)=='/') sb.insert(0, '0');
        if(sb.charAt(4)=='/') sb.insert(3,'0');
        day=sb.toString();
    }
    
    public void display()
    {
        System.out.println("00001 "+ten+" "+gioiTinh+" "+day1+" "+diaChi+" "+sdt+" "+day);
    }
        
    
    
}
//public class AMainn {
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        NhanVien a=new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
//        a.chuanHoa();
//        a.chuanHoa2();
//        a.chuanHoa3();
//        a.display();
//        
//        
//    }
//}