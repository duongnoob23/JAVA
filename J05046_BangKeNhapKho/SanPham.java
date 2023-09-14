
package J05046_BangKeNhapKho;


public class SanPham {
    private String stt,ten;
    private long soLuong,donGia,chietKhau,thanhTien;
    public static int dem=1;
    public SanPham(String ten, long soLuong, long donGia) {
        
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.thanhTien = thanhTien;
        
        String[] a=ten.split("\\s+");
        stt=Character.toUpperCase(a[0].charAt(0))+""+Character.toUpperCase(a[1].charAt(0));
        stt+=String.format("%02d", dem++);
        
        thanhTien=soLuong*donGia;
        
        if(soLuong >10) chietKhau=thanhTien*5/100;
        else if(soLuong>=8 && soLuong <=10) chietKhau=thanhTien*2/100;
        else if(soLuong>=5 && soLuong<8 ) chietKhau=thanhTien/100;
        else chietKhau=0;
        
       
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+chietKhau+" "+(thanhTien-chietKhau);
    }
    
    
    
}
