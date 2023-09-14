import static java.lang.Math.*;
import java.util.Scanner;

 class tongPhanSo {

    private long tu, mau;

    public tongPhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long a, long b) {
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    public void rutGon()
    {
        long m=gcd(tu,mau);
        tu/=m;
        mau/=m;
    }
    public void add(tongPhanSo b)
    {
        long newTu = tu*b.mau+mau*b.tu;
        long newMau = mau*b.mau;
        tu=newTu;
        mau=newMau;
        
        rutGon();
    }
    public String toString()
    {
        return tu+"/"+mau;
    }
}
//public class AMainn {
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        tongPhanSo a = new tongPhanSo(sc.nextLong(), sc.nextLong());
//        tongPhanSo b = new tongPhanSo(sc.nextLong(), sc.nextLong());
//        a.add(b);
//        
//        System.out.println(a);
//        
//    }
//}