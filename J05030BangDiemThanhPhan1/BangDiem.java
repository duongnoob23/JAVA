
package J05030BangDiemThanhPhan1;


public class BangDiem {
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

    public String getLop() {
        return lop;
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
