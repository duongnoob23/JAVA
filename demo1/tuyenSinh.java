import java.util.Scanner;
import static java.lang.Math.*;

class tuyenSinh{
    private String ma,ten;
    private float toan,ly,hoa;

    public tuyenSinh(String ma, String ten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        
        
    }
    
    
    
    public float tongDiem()
    {
        return toan*2+ly+hoa;
    }
    
    public float diemUuTien()
    {       
        char x=ma.charAt(2);
        if(x=='1') return 0.5f;
        else if(x=='2') return 1.0f;
        else return 2.5f;
    }
    public String trangThai()
    {
        if(tongDiem()+diemUuTien()>=24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    
    
    public String toString()
    {
        String res="";
        res+=ma+" "+ten+" ";
        
        if(diemUuTien()==(int)diemUuTien()) res+=(String.format("%.0f ", diemUuTien()));
        else res+=String.format("%.1f ",diemUuTien());
        if(tongDiem()==(int)tongDiem()) res+=(String.format("%.0f ", tongDiem()));
        else res+=String.format("%.1f ",tongDiem());
        res+=trangThai();
        return res;
    }
 
}

//public class AMainn {
//    public static Scanner sc=new Scanner(System.in);
//    public static void main(String[] args)  {
//        tuyenSinh a=new tuyenSinh(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
//        System.out.println(a);
//    }
//}