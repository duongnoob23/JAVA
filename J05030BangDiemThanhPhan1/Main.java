
package J05030BangDiemThanhPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class BangDiem {
    private String ma,ten,lop;
    private float d1,d2,d3;
    
    public BangDiem(String ma, String ten, String lop, float d1, float d2, float d3) {
        
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString()
    {
        String res="";
        res+=ma+" "+ten+" "+lop+" ";
        res+=String.format("%.1f ", d1);
        res+=String.format("%.1f ", d2);
        res+=String.format("%.1f", d3);
        return res;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<BangDiem> a=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++)
        {
            
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            float d1=Float.parseFloat(sc.nextLine());
            float d2=Float.parseFloat(sc.nextLine());
            float d3=Float.parseFloat(sc.nextLine());
            BangDiem moi=new BangDiem(ma,ten,lop,d1,d2,d3);
            a.add(moi);
        }
        Collections.sort(a,new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
            
        });
        int dem=1;
        for(BangDiem x:a)
        {
            System.out.print(dem++ +" ");
            System.out.println(x);
        }
    }
}
/*

3
B20DCCN999
Nguyen Van Nam
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van An
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Nguyen Van Binh
D20CQCN01-B
9.0
5.0
6.0
*/