import java.math.BigInteger;
import java.util.Scanner;

 class PhanSo1 {
    private long tu,mau;

    public PhanSo1(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    
    public static long gcd(long  a,long b)
    {
        BigInteger a1=BigInteger.valueOf(a);
        BigInteger b1=BigInteger.valueOf(b);
        BigInteger c=a1.gcd(b1);
        return c.longValue();
    }
    
    
    public static PhanSo1 rutGon(PhanSo1 a)
    {
        long gt=gcd(a.tu,a.mau);
        PhanSo1 ans=new PhanSo1(a.tu/gt,a.mau/gt);
        return ans;
        
        
    }
    
    @Override
    public String toString()
    {
        return tu+"/"+mau;
    }
      
}
//public class AMainn {
//    public static Scanner sc=new Scanner(System.in);
//    public static void main(String[] args)  {
//        int t=sc.nextInt();
//        while(t-->0)
//        {
//            
//
//    PhanSo1 a=new PhanSo1(sc.nextInt(),sc.nextInt());
//    PhanSo1 b=new PhanSo1(sc.nextInt(),sc.nextInt());
//    
//    
//    PhanSo1 d=new PhanSo1 (   (long)Math.pow(a.getMau()*b.getTu()+a.getTu()*b.getMau(), 2)  ,  (long)Math.pow( a.getMau()*b.getMau(), 2)   );
//    d=PhanSo1.rutGon(d);
//    PhanSo1 c=new PhanSo1(  a.getTu()*b.getTu()*d.getTu() ,  a.getMau()*b.getMau()*d.getMau() );
//    c=PhanSo1.rutGon(c);
//    
//    
//    System.out.print(d);
//        System.out.println(" "+c);
//        }
//    }
//}

