
package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HocSinh {
    private String id,ten;
    public float tong;
    public float p[];
    
    public HocSinh(String id,String ten, float[] p) {      
        this.id=id;
        this.ten = ten;
        
        tong=0f;
        for(int i=0;i<10;i++)
        {
            if(i==0 || i==1)
            {
                tong+=(p[i]*2f);
            }
            else
                tong+=p[i];
        }
        tong/=12f;
        tong=Math.round(tong*10f)/10f;
        
    }

    public String getId() {
        return id;
    }
    
    
    public String xepLoai()
    {
        if(tong>9) return "XUAT SAC";
        else if(tong >=8 && tong<8.9) return "GIOI";
        else if(tong >=7 && tong <7.9) return "KHA";
        else if(tong>=5 && tong<6.9) return "TB";
        else return "YEU";
    }
    @Override
    public String toString()
    {
        return id+" "+ten+" "+tong+" "+xepLoai();
    }
    
}


public class Main {
    public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int t=sc.nextInt();
        ArrayList<HocSinh> a=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
                sc.nextLine();
            String id="HS"+String.format("%02d",i+1);
            String ten=sc.nextLine();
            float[] p=new float[10];
            for(int j=0;j<10;j++)
            {
                p[j]=sc.nextFloat();
            }
            HocSinh moi=new HocSinh(id,ten,p);
            a.add(moi);
        }
        
        Collections.sort(a,new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(Float.compare(o1.tong, o2.tong)!=0)
                {
                    return Float.compare(o2.tong, o1.tong);
                }else
                    return  o1.getId().compareTo(o2.getId());
            }
            
        });
        
        for(HocSinh x:a)
        {
            System.out.println(x);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/