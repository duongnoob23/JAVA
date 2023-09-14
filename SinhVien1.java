
public class SinhVien1 {
    private String name;
    private String address;
    private String birth;
    private double gpa;
    
    
    SinhVien1()
    {
        System.out.println("constructor!");
    }

    public SinhVien1(String name, String address, String birth, double gpa) {
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.gpa = gpa;
    }
    
        
    public void inFor()
    {
        System.out.println(name +" "+address+" "+birth+" "+gpa);
         
    }
        
        
}
