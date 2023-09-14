
package J05042BangXepHang;


public class XepHang {
    private String name,homeWork,submit,worked;

    public XepHang(String name, String homeWork) {
        this.name = name;
        this.homeWork = homeWork;
        
        String[] a=homeWork.split("\\s+");
        submit=a[1];
        worked=a[0];
    }

    public String getSubmit() {
        return submit;
    }

    public String getWorked() {
        return worked;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString()
    {
        return name+" "+worked+" "+submit;
    }
    
}
