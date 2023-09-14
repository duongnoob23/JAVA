import static java.lang.Math.*;
import java.util.Scanner;


 class ThiSinh {
    private String ten,ns;
    private double diem1,diem2,diem3;

    public ThiSinh(String ten, String ns, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.ns = ns;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public void chuanHoa()
    {
        
        String[] a=ten.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++)
        {
            res+=a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase();
            res+=" ";
        }
        ten=res;
        
    }
    
    public void chuanHoa2()
    {
        StringBuilder sb=new StringBuilder(ns);
        if(sb.charAt(1)=='/')
            sb.insert(0,'0');
        if(sb.charAt(4)=='/')
            sb.insert(3,'0');
        ns=sb.toString();
    }
    public String getTen() {
        return ten;
    }

    public String getNs() {
        return ns;
    }
    public void display()
    {
        System.out.print(getTen()+getNs()+" ");
        System.out.printf("%.1f",diem1+diem2+diem3);
    }

    
}
//public class AMainn {
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        ThiSinh a=new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
//        a.chuanHoa2();
//        a.chuanHoa();
//        a.display();
//        
//    }
//}