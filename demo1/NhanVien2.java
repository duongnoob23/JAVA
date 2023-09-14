import java.util.Scanner;
import static java.lang.Math.*;

 class NhanVien2 {
    private String ten;
    private int luongCB,cong;
    private String chucVu;
    
    private int luong,thuong,phuCap,thuNhap;

    public NhanVien2(String ten, int luongCB, int cong, String chucVu) {
        this.ten = ten;
        this.luongCB = luongCB;
        this.cong = cong;
        this.chucVu = chucVu;
        
        luong=luongCB*cong;
        
        if(cong>=25) thuong=(int)(luong*0.2f);
        else if(cong >=22 && cong <25) thuong=(int)(luong*0.1f);
        else thuong=0;
        
        if(chucVu.equals("GD")) phuCap=250000;
        else if(chucVu.equals("PGD")) phuCap=200000;
        else if(chucVu.equals("TP")) phuCap=180000;
        else phuCap=150000;
        
        
        thuNhap=luong+thuong+phuCap;
        
    }
    
    public void chuanHoa()
    {
        String[] a=ten.split("\\s+");
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
    
    public void display()
    {
        System.out.println("NV01 "+ten+" "+luong+" "+thuong+" "+phuCap+" "+thuNhap);
    }
    
    
}
//public class AMainn {
//    public static Scanner sc=new Scanner(System.in);
//    public static void main(String[] args)  {
////             Scanner sc=new Scanner(new File("MONHOC.txt"));
//    NhanVien2 a=new NhanVien2(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
//    
//    a.chuanHoa();
//    a.display();
//      
//    }
//}