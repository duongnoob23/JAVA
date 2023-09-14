
package J05043_TinhThuNhapChoGiaoVien;


public class NhanVien {
    private String stt,ten,chucVu;
    private long luong,ngayCong,phuCap,luongChinh,tamUng,conLai;

    public NhanVien(String stt,String ten, String chucVu, long luong, long ngayCong) {
        this.stt=stt;
        this.ten = ten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
        
        if(chucVu.equals("GD")) phuCap=500;
        else if(chucVu.equals("PGD")) phuCap=400;
        else if(chucVu.equals("TP")) phuCap=300;
        else if(chucVu.equals("KT")) phuCap=250;
        else phuCap=100;
        
        luongChinh=luong*ngayCong;
        long a=((luongChinh+phuCap)*2)/3;
        if((phuCap+luongChinh)*2/3<25000) tamUng=(long)Math.round((double)a/1000)*1000;
        else tamUng=25000; 
        
        conLai=luongChinh-tamUng+phuCap;
    }

    public String getChucVu() {
        return chucVu;
    }
    
    @Override
    public String toString()
    {
        return stt+" "+ten+" "+phuCap+" "+luongChinh+" "+tamUng+" "+conLai;
    }
    
        
        
        
        
                 
        
    
    
    
}
