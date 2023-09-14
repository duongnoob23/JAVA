
package J05010_SapXepDanhSachMatHang;


public class MatHang {
    private String stt,ten,nhom;
    private float mua,ban;
    
    public MatHang(String stt,String ten, String nhom, float mua, float ban) {
        this.stt = stt;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    
    public float getLoiNhuan()
    {
        return ban-mua;
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+nhom+" "+String.format("%.2f", getLoiNhuan());
    }
            
            
}
