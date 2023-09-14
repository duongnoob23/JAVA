
package J05009_TimThuKhoaCuaKyThi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class ThuKhoa {
    private String stt;
    private String ten,ns;
    private float d1,d2,d3;
    
    public ThuKhoa(String stt,String ten, String ns, float d1, float d2, float d3) {
        this.stt=stt;
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public  float getDiem()
    {
        return d1+d2+d3;
    }

    public String getStt() {
        return stt;
    }
    
    @Override
    public String toString()
    {
        String res=stt+" "+ten+" "+ns+" ";
        res+=String.format("%.1f", d1+d2+d3);
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ThuKhoa> a=new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
  //Float.parseFloat(sc.nextLine())
            ThuKhoa m=new ThuKhoa(String.format("%1d", i),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            a.add(m);
        }
        float max1=-1e9f;
        
        Collections.sort(a,new Comparator<ThuKhoa>(){
            @Override
            public int compare(ThuKhoa o1, ThuKhoa o2) {
                if(Float.compare(o1.getDiem(), o2.getDiem())!=0)
                {
                    return Float.compare(o2.getDiem(), o1.getDiem());
                }
                else return o1.getStt().compareTo(o2.getStt());
            }
            
        });
        for(ThuKhoa x:a)
        {
            if(x.getDiem()>=max1)
            {
                max1=x.getDiem();
               
            }
        }
        for(ThuKhoa x:a)
        {
            if(x.getDiem()==max1)
            {
                System.out.println(x);
            }
        }
    }
}

/*


3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5

3
Lam Tien Duong
11/08/2003
9.0
7.0
6.0
Lam Tien Dung
8/1/2003
11.0
2.0
8.0
Nguyen Van Huan
2/9/2003
22.0
0
0

3
Lam Tien Duong
11/08/2003
9.0
7.0
6.0
3
Lam Tien Dung
8/1/2003
11.0
2.0
8.0
Nguyen Van Huan
2/9/2003
22.0
0
0
Nguyen Van A
12/12/1994
3.5
7.0
5.5

*/