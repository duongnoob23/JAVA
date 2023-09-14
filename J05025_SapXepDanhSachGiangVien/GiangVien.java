
package J05025_SapXepDanhSachGiangVien;


public class GiangVien {
    private String id,ten,chuyenNganh;

    public GiangVien(String id, String ten, String chuyenNganh) {
        this.id = id;
        this.ten = ten;
        this.chuyenNganh = chuyenNganh;
    }

    public String getTen() {
        String[] v=ten.split("\\s+");
        
        return v[v.length-1];
    }
    
    

    public String getId() {
        return id;
    }
    
    public String getChuyenNganh()
    {
        String[] a=chuyenNganh.split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=Character.toUpperCase(x.charAt(0));
        }
        return res;
    }
    
    @Override
    public String toString()
    {
        return id+" "+ten+" "+getChuyenNganh();
    }
}
