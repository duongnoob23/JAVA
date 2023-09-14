import java.util.Scanner;
import static java.lang.Math.*;
class GiaoVien{
    private String ma,ten;
    private int luong,phuCap,heSo;

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
        heSo=Integer.parseInt(ma.substring(2));
        
        String res=ma.substring(0, 2);
        if(res.equals("HT")) phuCap=2000000;
        else if(res.equals("HP")) phuCap=900000;
        else phuCap=500000;
        
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

    public int getLuong() {
        return luong*heSo+phuCap;
    }

    
    public void display()
    {
        System.out.println(ma+" "+ten+" "+heSo+" "+phuCap+" "+getLuong());
    }
}
        
public class AMainn {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        GiaoVien a=new GiaoVien(sc.nextLine(),sc.nextLine(),sc.nextInt());
        a.chuanHoa();
        a.display();
        
        
    }
}