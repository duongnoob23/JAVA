
package J05038_BangKeTienLuong;


public class TienLuong {
    private String stt,ten;
    private int luong,ngayCong;
    private String chucVu;
    private int luongThang,thuong,phuCap,thucLinh;

    public TienLuong(String stt, String ten, int luong, int ngayCong, String chucVu) {
        this.stt = stt;
        this.ten = ten;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        
        luongThang=luong*ngayCong;
        if(ngayCong>=25) thuong=luongThang*20/100;
        else if(ngayCong>=22 && ngayCong <25) thuong=luongThang*10/100;
        else thuong=0;
        
        if(chucVu.equals("GD")) phuCap=250000;
        else if(chucVu.equals("PGD")) phuCap=200000;
        else if(chucVu.equals("TP")) phuCap=180000;
        else phuCap=150000;
        
        
        
    }

    public int getThucLinh() {
        return luongThang+thuong+phuCap;
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+luongThang+" "+thuong+" "+phuCap+" "+getThucLinh();
    }
    
    
    
}
