
package J05009_TimThuKhoaCuaKyThi;

import java.util.ArrayList;
import java.util.Scanner;


public class ThuKhoa {
    private String stt;
    private String ten,ns;
    private float d1,d2,d3;
    
    public ThuKhoa(String stt,String ten, String ns, float d1, float d2, float d3) {
        this.stt= stt;
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
