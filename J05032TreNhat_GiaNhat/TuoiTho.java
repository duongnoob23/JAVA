
package J05032TreNhat_GiaNhat;

public class TuoiTho {
    private String ten,name,day,mon,year;

    public TuoiTho(String ten) {
        this.ten = ten;
       
        
        String[] a=ten.split("\\s+");
        name=a[0];
        day=a[1].substring(0,2);
        mon=a[1].substring(3,5);
        year=a[1].substring(6);
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getMon() {
        return mon;
    }

    public String getYear() {
        return year;
    }
   
    
    //11/08/2003
    @Override
    public String toString()
    {
        return name;
    }
    
    
}
