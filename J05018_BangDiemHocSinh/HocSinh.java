
package J05018_BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh {
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
